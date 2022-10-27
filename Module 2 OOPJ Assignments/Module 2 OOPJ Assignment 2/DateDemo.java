// Date:
import java.util.*;
class DateDemo
{
	int day;
	int month;
	int year;
	
	DateDemo()
	{
		day = 1;
		month = 1;
		year = 1970;
	}
	DateDemo(int day)
	{
		this();
		this.day = day;
	}
	DateDemo(int day, int month)
	{
		this();
		this.day = day;
		this.month = month;
	}
	DateDemo(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	void printPrevDay()
	{
		int tempDay = day;
		int tempMonth = month;
		int tempYear = year;
		tempDay--;
		if(tempDay<1)
		{
			tempMonth--;
			if(tempMonth<1)
			{
				tempYear--;
			}
			tempDay = 30;
			tempMonth = 12;
		}
		System.out.println("Previous Day is: "+tempDay+"/"+tempMonth+"/"+tempYear);
	}
	void printNextDay()
	{
		int tempDay = day;
		int tempMonth = month;
		int tempYear = year;
		tempDay++;
		if(tempDay>30)
		{
			tempMonth++;
			if(tempMonth>12)
			{
				tempYear++;
			}
			tempDay = 1;
			tempMonth = 1;
		}
		System.out.println("Next Day is: "+tempDay+"/"+tempMonth+"/"+tempYear);
	}
	void printCurrentDay()
	{
		System.out.println("Today's Date is: "+day+"/"+month+"/"+year);
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The Default date is: 01/01/1970");
		System.out.print("Enter the Day to be change in default date: ");
		int day = sc.nextInt();
		System.out.print("Enter the Month to be change in default date: ");
		int month = sc.nextInt();
		System.out.print("Enter the Year to be change in default date: ");
		int year = sc.nextInt();
		System.out.println();
		
		if(day>0 && day<31)
		{
			System.out.println("For only Day input from user:");
			DateDemo dobj1 = new DateDemo(day);
			dobj1.printCurrentDay();
			dobj1.printNextDay();
			dobj1.printPrevDay();
			System.out.println();
	
			if(month>0 && month<13)
			{
				System.out.println("For only Day and Month input from user:");
				DateDemo dobj2 = new DateDemo(day,month);
				dobj2.printCurrentDay();
				dobj2.printNextDay();
				dobj2.printPrevDay();
				System.out.println();
			
				if(year>0)
				{
					System.out.println("For Day, Month and Year input from user:");
					DateDemo dobj3 = new DateDemo(day,month,year);
					dobj3.printCurrentDay();
					dobj3.printNextDay();
					dobj3.printPrevDay();
				}
			}
		}
		else
		{
			System.out.println("Invalid Entry Please try again..");
		}	
	}
}


/*
Output:

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignment 2>java DateDemo
The Default date is: 01/01/1970
Enter the Day to be change in default date: 0
Enter the Month to be change in default date: 13
Enter the Year to be change in default date: 2000
Invalid Entry Please try again..

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignment 2>java DateDemo
The Default date is: 01/01/1970
Enter the Day to be change in default date: 22
Enter the Month to be change in default date: 12
Enter the Year to be change in default date: 2020

For only Day input from user:
Today's Date is: 22/1/1970
Next Day is: 23/1/1970
Previous Day is: 21/1/1970

For only Day and Month input from user:
Today's Date is: 22/12/1970
Next Day is: 23/12/1970
Previous Day is: 21/12/1970

For Day, Month and Year input from user:
Today's Date is: 22/12/2020
Next Day is: 23/12/2020
Previous Day is: 21/12/2020
*/