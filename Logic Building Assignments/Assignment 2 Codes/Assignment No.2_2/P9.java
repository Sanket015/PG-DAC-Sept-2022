// Assignment No.2_2

import java.util.Scanner;

class P9
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. of rows:");
	int r = sc.nextInt();
	
	
	for(int i=1;i<r;i++)
	{
		for(int j=1;j<=(r-i);j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=(r+1)-i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
  }
}


/*
	Enter no. of rows:5
        *
       **
      ***
     ****
    *****
     ****
      ***
       **
        *
*/