package lab8;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;



public class BoardGameTest {

	@Test
	public void test() {
		
		BoardGame bg = new BoardGame();
		BoardGame bg1 = new BoardGame();
		BoardGame bg2 = new BoardGame();
		bg.addPlayer("Hachi", GamePiece.YELLOW_BOOT, Location.CONSERVATORY); //7
		bg.addPlayer("Rosie", GamePiece.MAGENTA_RACER, Location.BALLROOM); //1
		bg1.addPlayer("Rosie", GamePiece.MAGENTA_RACER, Location.BALLROOM); //1
		bg1.addPlayer("Hong", GamePiece.BLUE_BOOT, Location.DINING_ROOM); //5
		bg2.addPlayer("Hong", GamePiece.BLUE_BOOT, Location.DINING_ROOM); //5
		bg2.addPlayer("Shin", GamePiece.GREEN_BOOT, Location.DINING_ROOM); //5
		String [] results = new String[2];
		String a = "Hachi";
		String b = "Rosie";
		String c = "Hong";
		results[0] = a;
		results[1] = b;
		Location[] loc = new Location[2];
		Location num1 = Location.BILLIARD_ROOM;
		Location num2 = Location.LOUNGE;
		num1 = loc[0];
		num2 = loc[1];
		String [] answers = new String[2];
		answers[0] = b;
		answers[1] = a;
		
		String[] solutions = new String[2];
		solutions[0] = b;
		solutions[1] = c;
		
		ArrayList<String> allPlayersAtALocation = new ArrayList<String>();
		 allPlayersAtALocation.add("Hong");
		 allPlayersAtALocation.add("Shin");
		 
		ArrayList<GamePiece> gamePieces = new ArrayList<GamePiece>();
		gamePieces.add(GamePiece.BLUE_BOOT);
		gamePieces.add(GamePiece.GREEN_BOOT);

		
		//Test addPLayer
		
		Assert.assertTrue("BoardGame does not add player correctly .", bg.addPlayer("Princeton", GamePiece.GREEN_BOOT, Location.KITCHEN));
		Assert.assertFalse("BoardGame does not add player correctly .", bg.addPlayer("Princeton", GamePiece.GREEN_BOOT, Location.KITCHEN));
		
		//Test getPlayerGamePiece
		
		Assert.assertEquals("BoardGame does not return correctly. ", GamePiece.GREEN_BOOT, bg.getPlayerGamePiece("Princeton"));
		Assert.assertEquals("BoardGame does not return correctly. ", "Princeton", bg.getPlayerWithGamePiece(GamePiece.GREEN_BOOT));
		Assert.assertEquals("BoardGame does not return correctly. ", null, bg.getPlayerWithGamePiece(GamePiece.RED_RACER));
		
		bg.movePlayer("Rosie", Location.LIBRARY);
		Assert.assertEquals(Location.LIBRARY, bg.getPlayersLocation("Rosie"));
		
		Assert.assertEquals(answers, bg.moveTwoPlayers(results, loc));
		Assert.assertEquals(solutions, bg1.moveTwoPlayers(solutions, loc));
		
		Assert.assertEquals(allPlayersAtALocation, bg2.getPlayersAtLocation(Location.DINING_ROOM) );
		
		Assert.assertEquals(gamePieces, bg2.getGamePiecesAtLocation(Location.DINING_ROOM) );

		//
		String[] allPlayers = new String[2];
		String p1 = "Hong";
		String p2 = "Shin";
		allPlayers[0] = p1;
		allPlayers[1] = p2;
		
		List<String>players= Arrays.asList(allPlayers) ;
		
		Set <String> Players = bg2.getPlayers(); 
		
		 for (int index = 0; index < allPlayers.length; index++)   {
			 Assert.assertTrue(Players.contains(allPlayers[index] ) ) ;
		 }
		 
		 Set<GamePiece> gpSet = new HashSet <GamePiece>();
		 gpSet.add(GamePiece.YELLOW_BOOT);
		 gpSet.add(GamePiece.MAGENTA_RACER);
		 Assert.assertEquals(gpSet, bg.getPlayerPieces());
		 
	
		 //
		 Set<Location> locSet = new HashSet <Location>();
		 locSet.add(Location.CONSERVATORY);
		 locSet.add(Location.BALLROOM);
		 
		 Assert.assertEquals("incorrect set returned",locSet, bg.getPlayerLocations());
		 
	
	
	
	}
}
