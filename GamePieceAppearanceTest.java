

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class GamePieceAppearanceTest {

	@Test
	public void test() {
		
		GamePieceAppearance obj = new GamePieceAppearance(Color.YELLOW, Shape.THIMBLE);
		
		Assert.assertEquals("GamePieceAppearance Color incorrect .", Color.YELLOW, obj.getColor());
		
		Assert.assertEquals("GamePieceAppearance Shape incorrect .", Shape.THIMBLE, obj.getShape());
	}

}
