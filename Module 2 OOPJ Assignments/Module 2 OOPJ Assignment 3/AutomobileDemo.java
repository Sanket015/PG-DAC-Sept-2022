//Automobile(make,type,maxSpeed,price,mileage,registrationNumber){Truck,Car}
// Truck(capacity,hoodType,noOfWheels)
// Car(noOfDoors,seatingCapacity)

import java.util.*;
class Automobile
{
	String make,type;
	double maxSpeed,price,milage;
	int registrationNumber;
	
	Automobile()
	{}
	Automobile(String make,String type,double maxSpeed,double price,double milage,int registrationNumber)
	{
		this.make = make;
		this.type = type;
		this.maxSpeed = maxSpeed;
		this.price = price;
		this.milage = milage;
		this.registrationNumber = registrationNumber;
	}
	
	void displayDetails()
	{
		System.out.println("Make: "+make);
		System.out.println("Type: "+type);
		System.out.println("Max Speed: "+maxSpeed+" km/hr");
		System.out.println("Price: Rs."+price);
		System.out.println("Milage: "+milage+" km/lit");
		System.out.println("Reg. Number: "+registrationNumber);
	}
	
}

class Truck extends Automobile
{
	double capacity;
	String hoodType;
	int noOfWheels;
	
	Truck()
	{}
	Truck(String make,String type,double maxSpeed,double price,double milage,int registrationNumber,double capacity,String hoodType,int noOfWheels)
	{
		super(make,type,maxSpeed,price,milage,registrationNumber);
		this.capacity = capacity;
		this.hoodType = hoodType;
		this.noOfWheels = noOfWheels;
	}
	
	void displayDetails()
	{
		System.out.println("Details of Truck:");
		System.out.println("------------------------");
		super.displayDetails();
		System.out.println("Capacity: "+capacity+" tons");
		System.out.println("Hood Type: "+hoodType);
		System.out.println("Number of Wheels: "+noOfWheels);
		System.out.println();
	}
}	

class Car extends Automobile
{
	int noOfDoors,seatingCapacity;
	
	Car()
	{}
	Car(String make,String type,double maxSpeed,double price,double milage,int registrationNumber,int noOfDoors,int seatingCapacity)
	{
		super(make,type,maxSpeed,price,milage,registrationNumber);
		this.noOfDoors = noOfDoors;
		this.seatingCapacity = seatingCapacity;
	}
	
	void displayDetails()
	{
		System.out.println("Details of Car:");
		System.out.println("------------------------");
		super.displayDetails();
		System.out.println("Number of Doors: "+noOfDoors);
		System.out.println("Seating Capacity: "+seatingCapacity);
	}
	
}

public class AutomobileDemo
{
	public static void main(String[] args)
	{
		Truck t = new Truck("Bharat Benz","HMV",160,3000000,15.3,22222,100,"Hood",10);
		t.displayDetails();
		
		Car c = new Car("Tata","SUV",180,1200000,25.5,1234,4,7);
		c.displayDetails();
	}
}


/*
Output:

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 3>java AutomobileDemo
Details of Truck:
------------------------
Make: Bharat Benz
Type: HMV
Max Speed: 160.0 km/hr
Price: Rs.3000000.0
Milage: 15.3 km/lit
Reg. Number: 22222
Capacity: 100.0 tons
Hood Type: Hood
Number of Wheels: 10

Details of Car:
------------------------
Make: Tata
Type: SUV
Max Speed: 180.0 km/hr
Price: Rs.1200000.0
Milage: 25.5 km/lit
Reg. Number: 1234
Number of Doors: 4
Seating Capacity: 7
*/