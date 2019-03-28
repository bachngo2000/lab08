

public class Driver {
	
	public static void main(String[] args) {
		
	BoardGame bg = new BoardGame();
	bg.addPlayer("Hachi", GamePiece.YELLOW_BOOT, Location.CONSERVATORY); //7
	bg.addPlayer("Rosie", GamePiece.MAGENTA_RACER, Location.BALLROOM); //1
	
	System.out.println(bg.getPlayers());
	
	}
}
