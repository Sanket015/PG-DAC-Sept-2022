//Q.6.	Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]

import java.util.*;

class FahrenheitToCelsius
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a reading of Temperature in Fahrenheit: ");
		float f = sc.nextFloat();
		float c =0.0f;
		
		c = (5*(f-32)/9);
		
		System.out.println(f+" Fahrenheit = "+c+" Celsius ");
	}
}

/*
 Enter a reading of Temperature in Fahrenheit: 31
31.0 Fahrenheit = -0.5555556 Celsius

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 1>java FahrenheitToCelsius
 Enter a reading of Temperature in Fahrenheit: 101
101.0 Fahrenheit = 38.333332 Celsius

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 1>java FahrenheitToCelsius
 Enter a reading of Temperature in Fahrenheit: 95
95.0 Fahrenheit = 35.0 Celsius
*/