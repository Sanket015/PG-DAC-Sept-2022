//Volume of Room:
import java.util.*;

class Room
{
	double height;
	double width;
	double breadth;
	
	Room()
	{}
	Room(double height, double width, double breadth)
	{
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	void volume()
	{
		double volume = height*width*breadth;
		System.out.println("Volume of Room is: "+volume+" cubic meters");
	}
}

class RoomDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of the Room in meters: ");
		double h = sc.nextDouble();
		System.out.println("Enter the width of the Room in meters: ");
		double w = sc.nextDouble();
		System.out.println("Enter the breadth of the Room in meters: ");
		double b = sc.nextDouble();
		
		Room r = new Room(h,w,b);
		r.volume();
	}
	
}


/*
Output:

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignment 2>java RoomDemo
Enter the height of the Room in meters:
10
Enter the width of the Room in meters:
10
Enter the breadth of the Room in meters:
10
Volume of Room is: 1000.0 cubic meters

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignment 2>javac RoomDemo.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignment 2>java RoomDemo
Enter the height of the Room in meters:
88
Enter the width of the Room in meters:
99
Enter the breadth of the Room in meters:
77.65
Volume of Room is: 676486.8 cubic meters
*/