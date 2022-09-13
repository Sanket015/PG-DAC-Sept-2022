//Q.9

import java.util.Scanner;

class Factors
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Positive Number:");
	int num = sc.nextInt();
	
	if(num<=0)
	{
		System.out.println("Please Enter a Positive Number and try again..");
	}
	else
	{
		System.out.print("The Factors of given Number are:");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	
  }
}

/*
Enter a Positive Number:5
The Factors of given Number are:1 5
---------------------------------------------------
Enter a Positive Number:1
The Factors of given Number are:1
---------------------------------------------------
Enter a Positive Number:0
Please Enter a Positive Number and try again..
---------------------------------------------------
Enter a Positive Number:-12
Please Enter a Positive Number and try again..
---------------------------------------------------
Enter a Positive Number:15
The Factors of given Number are:1 3 5 15
*/