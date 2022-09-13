// Assignment No.2_2

import java.util.Scanner;

class P15
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. of rows:");
	int r = sc.nextInt();
	
	
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i==3&&j==2||i==4&&j==2||i==4&&j==3)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}
  }
}


/*
	Enter no. of rows:5
    *
    **
    * *
    *  *
    *****
*/