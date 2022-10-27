//Q.5.	Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
//		Now convert the entered days into complete years, months and days and print them.
		

import java.util.*;

class DaysToYear
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a Number of Days: ");
		int days = sc.nextInt();
		int year,months=0;
		
		year=days/365;
		days=days%365;
		months=days/30;
		days=days%30;
		
		System.out.println(" Number of Years= "+year);
		System.out.println(" Number of Months= "+months);
		System.out.println(" Number of Days= "+days);
		
	}
}


/*
 Enter a Number of Days: 399
 Number of Years= 1 
 Number of Months= 1 
 Number of Days= 4
 
C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 1>java DaysToYear
 Enter a Number of Days: 670
 Number of Years= 1 
 Number of Months= 10 
 Number of Days= 5
*/