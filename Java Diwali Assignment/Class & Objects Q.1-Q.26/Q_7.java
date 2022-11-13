//Q.7. Java Program to Implement Shape Interface using Circle and Rectangle Class
import java.util.*;
interface Shape
{
	Scanner sc = new Scanner(System.in);
	public void getData();
	public void calArea();
	public void showArea();
}

class Circle implements Shape
{
	double rad,area;
	public void getData()
	{
		System.out.print("Enter radius of Circle : ");
		rad = sc.nextDouble();
	}
	public void calArea()
	{
		area = 3.14*rad*rad;
	}
	public void showArea()
	{
		System.out.println("Area of Circle is "+area);
	}
}

class Rectangle implements Shape
{
	double length,breadth,area;
	public void getData()
	{
		System.out.print("Enter length of Rectangle : ");
		length = sc.nextDouble();
		System.out.print("Enter breadth of Rectangle : ");
		breadth = sc.nextDouble();
	}
	public void calArea()
	{
		area = length*breadth;
	}
	public void showArea()
	{
		System.out.println("Area of Rectangle is "+area);
	}
}

public class Q_7
{
	public static void main(String[] args)
	{
		Circle c = new Circle();
		c.getData();
		c.calArea();
		c.showArea();
		System.out.println();
		
		Rectangle r = new Rectangle();
		r.getData();
		r.calArea();
		r.showArea();
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_7
Enter radius of Circle : 10
Area of Circle is 314.0

Enter length of Rectangle : 10
Enter breadth of Rectangle : 20
Area of Rectangle is 200.0
*/