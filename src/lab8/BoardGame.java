package lab8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class BoardGame {

	protected LinkedHashMap<String, GamePiece> playerPieces;

	protected LinkedHashMap<String, Location> playerLocations;

	public BoardGame()   {

		playerPieces = new LinkedHashMap<String, GamePiece>();

		playerLocations = new LinkedHashMap<String, Location>();

	}

	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)   {

		if (playerPieces.get(playerName) == null && playerLocations.get(playerName) == null)   {
			playerPieces.put(playerName, gamePiece);
			playerLocations.put(playerName, initialLocation);
			return true;
		}
		return false;
	}

	public GamePiece getPlayerGamePiece(String playerName)   {

		return playerPieces.get(playerName);

	}

	public String getPlayerWithGamePiece(GamePiece gamePiece)   {

		String temp = null;
		
		for (Map.Entry<String, GamePiece> entry: playerPieces.entrySet())   {
			if (entry.getValue().equals(gamePiece))   {
				temp = entry.getKey();
			}
			}
		return temp;
	}


	public void movePlayer(String playerName,  Location newLocation)   {

		playerLocations.put(playerName, newLocation);
	}
	
	public String[] moveTwoPlayers(String[] playerNames,  Location[] newLocations)   {
		
		String player1 = playerNames[0];
		String player2 = playerNames[1];
		
		Location loc1 = newLocations[0];
		Location loc2 = newLocations[1];
		
		String[] results = new String [2];
		
		if (GamePiece.movesFirst(playerPieces.get(player1), playerPieces.get(player2)).equals(playerPieces.get(player1)))   {
			results[0] = player1;
			results[1] = player2;
			
			playerLocations.put(player1, loc1);
			playerLocations.put(player2, loc2);
			
		}
		
		else   {
			results[0] = player2;
			results[1] = player1;
			
			playerLocations.put(player2, loc2);
			playerLocations.put(player1, loc1);
		}
		
		return results;
		
	}
	
	public Location getPlayersLocation(String player)   {
		
		return playerLocations.get(player);
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc)   {
		
		ArrayList<String> allPlayersAtALocation = new ArrayList<String>();
		
		for (Map.Entry<String, Location> entry: playerLocations.entrySet())   {
			if (entry.getValue().equals(loc))  {
				allPlayersAtALocation.add(entry.getKey());
			}
		}
		return allPlayersAtALocation;
	}

	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)   {
		
		ArrayList<GamePiece> gamePieces = new ArrayList<GamePiece>();
		
		for (Map.Entry<String, Location> entry: playerLocations.entrySet())   {
			
			if (entry.getValue().equals(loc))   {
				gamePieces.add(playerPieces.get(entry.getKey()));
				
			}
	}
		return gamePieces;
	
}
	public Set<String> getPlayers()   {
		
		return playerPieces.keySet();
	}
	
	public Set<Location> getPlayerLocations()    {
		
		return new HashSet<Location>(playerLocations.values());
}
	
	public Set<GamePiece> getPlayerPieces()   {
		
		return new HashSet<GamePiece>(playerPieces.values());

		
}
}


