//Q.6

import java.util.Scanner;

class LeapYear
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Year Number in the form of YYYY:");
	int year = sc.nextInt();
	if(year%4==0)
	{
		if(year%400==0)
		{
			System.out.println(year+" is a Leap Year");
		}
		else if(year%100==0)
		{
			System.out.println(year+" is Not a Leap Year");
		}
        else
		{
			System.out.println(year+" is a Leap Year");
		}
	
	}
    else
    {
    	System.out.println(year+" is Not a Leap Year");
	}	
  }
}

/*
Enter a Year Number in the form of YYYY:2000
2000 is a Leap Year
-----------------------------------------------------
Enter a Year Number in the form of YYYY:1900
1900 is Not a Leap Year
-----------------------------------------------------
Enter a Year Number in the form of YYYY:100
100 is Not a Leap Year
-----------------------------------------------------
Enter a Year Number in the form of YYYY:2016
2016 is a Leap Year
*/