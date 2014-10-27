import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest 
{
	TriangleApplication tri = new TriangleApplication();
	
	@Test
	public void testTypeTriangle() 
	{
		//Impossible
		assertEquals(tri.findTriangle(1, 2, 3), "Impossible");
		assertEquals(tri.findTriangle(1, 3, 2), "Impossible");
		assertEquals(tri.findTriangle(3, 2, 1), "Impossible");
		
		//Equilateral
		assertEquals(tri.findTriangle(2, 2, 2), "Equilateral");
		assertNotEquals(tri.findTriangle(1, 2, 3), "Equilateral");
		
		//Isosceles
		assertEquals(tri.findTriangle(2, 2, 3), "Isosceles");
		assertEquals(tri.findTriangle(3, 2, 2), "Isosceles");
		assertEquals(tri.findTriangle(2, 3, 2), "Isosceles");
		assertNotEquals(tri.findTriangle(2, 3, 1), "Isosceles");
		
		//Right Angle
		assertEquals(tri.findTriangle(3, 4, 5), "RightAngled");
		assertEquals(tri.findTriangle(5, 3, 4), "RightAngled");
		assertEquals(tri.findTriangle(4, 5, 3), "RightAngled");
		assertNotEquals(tri.findTriangle(4, 5, 6), "RightAngled");
		
		//Scalene
		assertEquals(tri.findTriangle(6, 5, 4), "Scalene");
		
		//Impossible
		assertEquals(tri.findTriangle(0, 0, 0), "Impossible");
	}
	
	@Test
	public void testRightAngle()
	{
		assertTrue(tri.checkRightAngle(3, 4, 5));
		assertTrue(tri.checkRightAngle(5, 3, 4));
		assertTrue(tri.checkRightAngle(4, 5, 3));
		assertFalse(tri.checkRightAngle(1, 2, 1));
	}

}
