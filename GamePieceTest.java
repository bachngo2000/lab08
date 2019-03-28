

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class GamePieceTest {

	@Test
	public void test() {
		
		GamePiece gp1 = GamePiece.BLUE_BOOT; //5
		
		GamePiece gp2 = GamePiece.RED_THIMBLE;  //10
		
		GamePiece gp3 = GamePiece.MAGENTA_RACER;//1
		
		//Testing Color
		Assert.assertEquals("GamePiece Color incorrect .", Color.BLUE, gp1.getColor());
		Assert.assertEquals("GamePiece Color incorrect .", Color.RED, gp2.getColor());
		//Testing Shape
		Assert.assertEquals("GamePiece Shape incorrect .", Shape.BOOT, gp1.getShape());
		Assert.assertEquals("GamePiece Shape incorrect .", Shape.THIMBLE, gp2.getShape());
		//Testing Priority
		Assert.assertEquals("GamePieces Priority incorrect .", gp1, GamePiece.movesFirst(gp1, gp2));
		Assert.assertEquals("GamePieces Priority incorrect .", gp3, GamePiece.movesFirst(gp1, gp3));
		//Testing toString
		Assert.assertEquals("GamePiece toString incorrect .", "BLUE_BOOT: a BLUE BOOT with priority 5", gp1.toString());
		Assert.assertEquals("GamePiece toString incorrect .", "RED_THIMBLE: a RED THIMBLE with priority 10", gp2.toString());
	}

}
