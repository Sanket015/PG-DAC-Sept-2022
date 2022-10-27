// class - Box
// variables - height,width,breadth
// methods - getVolume(),getArea()

import java.util.*;
class Box
{
	double height;
	double width;
	double breadth;
	
	Box()
	{}
	Box(double height, double width, double breadth)
	{
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	void getVolume()
	{
		double volume = height*width*breadth;
		System.out.println("Volume of a Box is: "+volume);
	}
	void getArea()
	{
		double surfaceArea = 2*((height*width)+(width*breadth)+(breadth*height));
		System.out.println("Volume of a Box is: "+surfaceArea);
	}
}

class BoxDemo
{
	public static void main(String[] args)
	{
		System.out.println("About Box 1:");
		Box b1 = new Box(50,100,30);
		b1.getVolume();
		b1.getArea();
		System.out.println();
		
		System.out.println("About Box 2:");
		Box b2 = new Box(77.5,30.5,30.8);
		b2.getVolume();
		b2.getArea();
	}	
}

/*
Output:

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignment 2>java BoxDemo
About Box 1:
Volume of a Box is: 150000.0
Volume of a Box is: 19000.0

About Box 2:
Volume of a Box is: 72803.5
Volume of a Box is: 11380.3
*/