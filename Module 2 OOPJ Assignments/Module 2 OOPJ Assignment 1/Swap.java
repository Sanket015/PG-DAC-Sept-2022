//Q.7.	Write a program to swap two numbers without using third variable.


import java.util.*;

class Swap
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter 1st Number: ");
		int a = sc.nextInt();
		System.out.print(" Enter 2nd Number: ");
		int b = sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping the numbers are: ");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}
}

/*
 Enter 1st Number: 10
 Enter 2nd Number: 99
After Swapping the numbers are:
a= 99
b= 10

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 1>java Swap
 Enter 1st Number: -21
 Enter 2nd Number: -33
After Swapping the numbers are:
a= -33
b= -21
*/
