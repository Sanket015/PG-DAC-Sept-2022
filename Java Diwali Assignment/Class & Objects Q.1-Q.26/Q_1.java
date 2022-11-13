//Q.1. Java Program to Illustrate Use of All Features of Abstract Class
abstract class Bank1
{    
	Bank1()
	{
		System.out.println("Welcome to Banking Sector");
	}
	abstract void display();
	double rate;
	abstract void setRate();
}    
class SBI extends Bank1
{   
	SBI()
	{
		System.out.println("Welcome to SBI bank");
	}
	
	void setRate()
	{
		rate=6.5;
	}
	void display()
	{
		System.out.println("Rate of interest = "+rate);
	}
	
	
}    
	
class PNB extends Bank1
{    
	PNB()
	{
		System.out.println("Welcome to PNB bank");
	}
	void setRate()
	{
		rate=9.5;
	}
	void display()
	{
		System.out.println("Rate of interest = "+rate);
	}
}    
		
class Q_1
{    
	public static void main(String args[])
	{    
		Bank1 b;  
		b=new SBI();  
		b.setRate();
		b.display();
		b=new PNB();  
		b.setRate();
		b.display();
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_1
Welcome to Banking Sector
Welcome to SBI bank
Rate of interest = 6.5
Welcome to Banking Sector
Welcome to PNB bank
Rate of interest = 9.5
*/ 