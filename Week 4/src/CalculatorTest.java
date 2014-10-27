import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {

	Calculator cal = new Calculator();
	
	@Test
	public void testAddWithNoInput(){
		assertEquals(0, cal.add(""));
	}
	
	@Test
	public void testAddWithOneInput(){
		assertEquals(5, cal.add("5"));
	}
	
	@Test
	public void testAddTwoNumbers(){
		assertEquals(10, cal.add("5,5"));
	}
	


}
