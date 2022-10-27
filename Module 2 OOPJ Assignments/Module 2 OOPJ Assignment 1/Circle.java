//Q.2.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. 
//      Then calculate and print the area and circumference of the circle.

import java.util.*;

class Circle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a Radius value of a Circle: ");
		float r = sc.nextFloat();
		
		Circle c = new Circle();
		c.area(r);
		c.circumference(r);
	}
	
	void area(float rad)
	{
		float area=0.0f;
		area = (float)(3.142*rad*rad);
		System.out.println(" The Area of a Circle having Radius "+rad+" is: "+area);
	}
	
	void circumference(float rad)
	{
		float circumference =0.0f;
		circumference = (float)(2*3.142*rad);
		System.out.println(" The Circumference of a Circle having Radius "+rad+" is: "+circumference);
	}
}


/*
 Enter a Radius value of a Circle:10
 The Area of a Circle having Radius 10.0 is: 314.2
 The Circumference of a Circle having Radius 10.0 is: 62.84

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 1>java Circle
 Enter a Radius value of a Circle:5
 The Area of a Circle having Radius 5.0 is: 78.55
 The Circumference of a Circle having Radius 5.0 is: 31.42

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 1>java Circle
 Enter a Radius value of a Circle:100
 The Area of a Circle having Radius 100.0 is: 31420.0
 The Circumference of a Circle having Radius 100.0 is: 628.4
 */