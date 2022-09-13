//Q.12

import java.util.Scanner;

class AdditionOfNumbersWithoutArithmaticOperator
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a 1st Number:");
	int a = sc.nextInt();
	System.out.print("Enter a 2nd Number:");
	int b = sc.nextInt();
	System.out.print("Addition of "+a+" and "+b+" is:");
	if(b>=0)
	{
		for(int i=1;i<=b;i++)
		{
			a++;
		}
		System.out.print(a);
	}
	else
	{
		for(int i=0;i>b;i--)
		{
			a--;
		}
		System.out.print(a);
	}
  }
}

/*
Enter a 1st Number:12
Enter a 2nd Number:12
Addition of 12 and 12 is:24
-------------------------------------------------
Enter a 1st Number:12
Enter a 2nd Number:-2
Addition of 12 and -2 is:10
-------------------------------------------------
Enter a 1st Number:-12
Enter a 2nd Number:-12
Addition of -12 and -12 is:-24
-------------------------------------------------
Enter a 1st Number:-12
Enter a 2nd Number:5
Addition of -12 and 5 is:-7
*/