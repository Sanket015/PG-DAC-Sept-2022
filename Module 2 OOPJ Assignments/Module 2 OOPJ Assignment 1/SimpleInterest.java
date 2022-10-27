//Q.4.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.


import java.util.*;

class SimpleInterest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a Principle Amount: ");
		int p = sc.nextInt();
		System.out.print(" Enter a Rate of Interest: ");
		float r = sc.nextFloat();
		System.out.print(" Enter a Time Period in Years: ");
		int t = sc.nextInt();
		float simpleInterest=0.0f;
		
		simpleInterest = (float)(p*r*t)/100;
		
		System.out.println(" Simple Interest = "+simpleInterest);
	}
}

/*
 Enter a Principle Amount: 7200
 Enter a Rate of Interest: 14
 Enter a Time Period in Years: 7
 Simple Interest = 7056.0
*/
