import java.util.Scanner;

public class TriangleApplication 
{
	int x, y, z;
	boolean quit = false;
	Scanner input = new Scanner(System.in);
	
	public static void main(String args[])
	{
		new TriangleApplication();
	}
	
	public TriangleApplication()
	{
//		do
//		{
//			System.out.println("Testing Clasification of Triangles\n");
//			
//			System.out.println("Enter value for x");
//			x = input.nextInt();
//			System.out.println("Enter value for y");
//			y = input.nextInt();
//			System.out.println("Enter value for z");
//			z = input.nextInt();
//			System.out.println("Classification: " + findTriangle(x, y, z));
//		
//			System.out.println("Do you want to quit? true/false [lowercase]\n");
//			quit = input.nextBoolean();
//		}
//		while(!quit);
	}
	
	public String findTriangle(int x, int y, int z)
	{
		if(!((x+y) > z && (y+z) > x && (x+z) > y))
		{
			return "Impossible";
		}
		else if(x == y && y == z)
		{
			return "Equilateral";
		}
		else if(x == y || y == z || x == z)
		{
			return "Isosceles";
		}
		else if(checkRightAngle(x, y, z))
		{
			return "RightAngled";
		}
		else //(!checkRightAngle(x, y, z) && x != y && y != z && x != z)
		{
			return "Scalene";
		}
	}
	
	public boolean checkRightAngle(int x, int y, int z)
	{
		if(x*x + y*y ==z*z)
		{
			return true;
		}
		else if(z*z +y*y == x*x)
		{
			return true;
		}
		else if(x*x + z*z == y*y)
		{
			return true;
		}
		return false;
	}
}
