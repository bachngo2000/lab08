

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ShapeTest {

	@Test
	public void testShapeToString() {
		Assert.assertEquals("Shape toString incorrect .", "thimble", Shape.THIMBLE.toString());
		Assert.assertEquals("Shape toString incorrect .", "boot", Shape.BOOT.toString());
		Assert.assertEquals("Shape toString incorrect .", "racecar", Shape.RACECAR.toString());


	}

}
