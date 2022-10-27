//Q.8

import java.util.Scanner;

class Digits
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number:");
	int num = sc.nextInt();
	int dig=0,a=0;
	if(num<=0)
	{
		System.out.println("Enter Positive Number of terms and try again...");
	}
	else
	{
		System.out.print("The digits of "+num+" are : " );
		while(num>0)     // to reverse a num
		{
			dig=num%10;
			num=num/10;
			a=a*10+dig;
		}
		while(a>0)
		{
			System.out.print((a%10)+" ");
		    a=a/10;
	    }
    }
  }
}

/*
Enter a Number:543
The digits of 543 are : 5 4 3
-------------------------------------------------
Enter a Number:19987
The digits of 19987 are : 1 9 9 8 7
-------------------------------------------------
Enter a Number:0
Enter Positive Number of terms and try again...
-------------------------------------------------
Enter a Number:-1999
Enter Positive Number of terms and try again...
*/
