//Q.1

import java.util.Scanner;

class EvenOdd
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number:");
	int num = sc.nextInt();
	if(num%2 == 0)
	{
		System.out.println(num+" is Even Number");
	}
    else
    {
    	System.out.println(num+" is Odd Number");
	}	
  }
}

/*
Enter a Number:2
2 is Even Number
----------------------------------------
Enter a Number:3
3 is Odd Number
----------------------------------------
Enter a Number:0
0 is Even Number
----------------------------------------
Enter a Number:-4
-4 is Even Number

*/