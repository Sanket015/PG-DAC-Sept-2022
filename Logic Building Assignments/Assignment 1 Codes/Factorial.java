//Q.2

import java.util.Scanner;

class Factorial
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Positive Number:");
	int num = sc.nextInt();
	int fact=1,a=num;	
	
	if(a>=0)
	{
		if(a==0)
		{
			System.out.println("The Factorial of "+num+" is: 1");
	    }
	    else
	    {
	     	while(a!=0)
		    {
		    	fact=fact*a;
		    	a--;
		    }
		    System.out.println("The Factorial of "+num+" is: "+fact);
	    }
	}
	else
	{
		System.out.println(" Please Enter a Positive Number and try again..");
	}
  }
}

/*
Enter a Positive Number:5
The Factorial of 5 is: 120
---------------------------------------------

Enter a Positive Number:0
The Factorial of 0 is: 1
---------------------------------------------

Enter a Positive Number:-5
Please Enter a Positive Number and try again..
*/