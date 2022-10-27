//Q.5

import java.util.Scanner;

class PositiveNumber
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number:");
	int num = sc.nextInt();
	
    if(num>=1)
	{
		System.out.println(num+" is a Positive Number"); 	
	}
	else if(num==0)
	{
		System.out.println(num+" is neither a Positive nor a Negative Number");
	}
	else
	{
		System.out.println(num+" is a Negative Number");
	}
  }--------------------------------------------------
}

/*
Enter a Number:5
5 is a Positive Number
--------------------------------------------------
Enter a Number:0
0 is neither a Positive nor a Negative Number
--------------------------------------------------
Enter a Number:-22
-22 is a Negative Number

*/