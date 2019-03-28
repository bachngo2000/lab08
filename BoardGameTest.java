import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;



public class BoardGameTest {

	@Test
		public void Test()   {
		
		//Testing BoardGame Constructor
		BoardGame bg = new BoardGame();
		BoardGame bg1 = new BoardGame();
		BoardGame bg2 = new BoardGame();
		
		//add Players to bg
		bg.addPlayer("Hachi", GamePiece.YELLOW_BOOT, Location.CONSERVATORY); //7
		bg.addPlayer("Rosie", GamePiece.MAGENTA_RACER, Location.BALLROOM); //1
		
		//addPlayers to bg1
		bg1.addPlayer("Rosie", GamePiece.MAGENTA_RACER, Location.BALLROOM); //1
		bg1.addPlayer("Hong", GamePiece.BLUE_BOOT, Location.DINING_ROOM); //5
		
		//add Players to bg2
		bg2.addPlayer("Hong", GamePiece.BLUE_BOOT, Location.DINING_ROOM); //5
		bg2.addPlayer("Shin", GamePiece.GREEN_BOOT, Location.DINING_ROOM); //5
		

		//Testing addPlayer: check Assert.assertFalse and assertTrue
		Assert.assertTrue("BoardGame does add player correctly .", bg.addPlayer("Princeton", GamePiece.GREEN_BOOT, Location.KITCHEN));
		Assert.assertFalse("BoardGame does not add player correctly .", bg.addPlayer("Rosie", GamePiece.MAGENTA_RACER, Location.BALLROOM));
		Assert.assertFalse("BoardGame does not add player correctly .", bg.addPlayer("Jack", GamePiece.MAGENTA_RACER, Location.BALLROOM));

		//Test getPlayerGamePiece
		Assert.assertEquals("BoardGame does not return correctly. ", GamePiece.GREEN_BOOT, bg.getPlayerGamePiece("Princeton"));
		
		//Test getPlayerWithGamePiece
		Assert.assertEquals("BoardGame does not return correctly. ", "Princeton", bg.getPlayerWithGamePiece(GamePiece.GREEN_BOOT));
		Assert.assertEquals("BoardGame does not return correctly. ", null, bg.getPlayerWithGamePiece(GamePiece.RED_RACER));
		
		
		//test movePlayer
		bg.movePlayer("Rosie", Location.LIBRARY);
		Assert.assertEquals(Location.LIBRARY, bg.getPlayersLocation("Rosie"));
		
		//testing moveTwoPlayers
		String [] players = new String[2];
		String a = "Hachi";//7
		String b = "Rosie";//1
		players[0] = a;
		players[1] = b;
		
		Location[] loc = new Location[2];
		Location num1 = Location.BILLIARD_ROOM;
		Location num2 = Location.LOUNGE;
		loc[0] = num1;
		loc[1] = num2;
		
		String [] answers = new String[2];
		answers[0] = b;
		answers[1] = a;
		
		String c ="Hong"; //5
		
		String[] solutions = new String[2];
		solutions[0] = b;
		solutions[1] = c;
		
		Assert.assertEquals(answers, bg.moveTwoPlayers(players, loc));
		
		Assert.assertEquals(solutions, bg1.moveTwoPlayers(solutions, loc));
		
		
		//getPlayersAtLocation
		
		ArrayList<String> allPlayersAtALocation = new ArrayList<String>();
			allPlayersAtALocation.add("Hong");
			allPlayersAtALocation.add("Shin");
		Assert.assertEquals(allPlayersAtALocation, bg2.getPlayersAtLocation(Location.DINING_ROOM) );
		
		
		ArrayList<GamePiece> gamePieces = new ArrayList<GamePiece>();
			gamePieces.add(GamePiece.BLUE_BOOT);
			gamePieces.add(GamePiece.GREEN_BOOT);
		Assert.assertEquals(gamePieces, bg2.getGamePiecesAtLocation(Location.DINING_ROOM) );
		
		//Testing: another way to do it
		/*String[] allPlayers = new String[2];
		String p1 = "Hong";
		String p2 = "Shin";
		allPlayers[0] = p1;
		allPlayers[1] = p2;
		
		List<String>players= Arrays.asList(allPlayers) ;
		
		Set <String> Players = bg2.getPlayers(); 
		
		 for (int index = 0; index < allPlayers.length; index++)   {
			 Assert.assertTrue(Players.contains(allPlayers[index] ) ) ;
		 } */
		
		
		Set<String> allPlayers = new HashSet <String>();
		allPlayers.add("Hong");
		allPlayers.add("Shin");
		Assert.assertEquals(allPlayers, bg2.getPlayers());
		 
		
		//create set and add what you expect
		 Set<GamePiece> gpSet = new HashSet <GamePiece>();
		 gpSet.add(GamePiece.YELLOW_BOOT);
		 gpSet.add(GamePiece.MAGENTA_RACER);
		 gpSet.add(GamePiece.GREEN_BOOT);
		Assert.assertEquals(gpSet, bg.getPlayerPieces());
		 

		
		Set<Location> locSet = new HashSet <Location>(); 
		 locSet.add(Location.LOUNGE);
		 locSet.add(Location.KITCHEN);
		 locSet.add(Location.BILLIARD_ROOM);
		 
		//assert statement
		 Assert.assertEquals("incorrect set returned", locSet, bg.getPlayerLocations());
		 
	
	
	
	}
}
