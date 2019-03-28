

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class ColorTest {

	@Test
	public void test() {
		Color col = null;
		
		//RED
		col = Color.RED;
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getR());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getG());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getB());
		
		//GREEN
		col = Color.GREEN;
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getR());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getG());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getB());
		
		//BLUE
		col = Color.BLUE;
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getR());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getG());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getB());
		
		//YELLOW
		col = Color.YELLOW;
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getR());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getG());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getB());
		
		//CYAN
		col = Color.CYAN;
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getR());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getG());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getB());
		
		//MAGENTA
		col = Color.MAGENTA;
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getR());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getG());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getB());
		
		
	}

}
