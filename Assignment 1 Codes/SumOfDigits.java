//Q.10

import java.util.Scanner;

class SumOfDigits
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number:");
	int num = sc.nextInt();
	int sum=0,a=0;
	
	if(num<=0)
	{
		System.out.println("Please Enter a Positive Number and try again..");
	}
	else
	{
		while(num>0)
		{
			a=num%10;
			sum=sum+a;
			num=num/10;
		}
		 System.out.print("The sum of Digits of Number is: "+sum);
	}
  }
}

/*
Enter a Number:77
The sum of Digits of Number is: 14
-----------------------------------------
Enter a Number:123
The sum of Digits of Number is: 6
-----------------------------------------
Enter a Number:099
The sum of Digits of Number is: 18
*/