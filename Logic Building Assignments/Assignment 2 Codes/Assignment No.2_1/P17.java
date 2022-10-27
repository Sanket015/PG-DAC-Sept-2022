// Assignment No.2_1

import java.util.Scanner;

class P17
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. of rows:");
	int r = sc.nextInt();
	
	
	int a=1;
	for(int i=1;i<=r;i++)
	{
		
		for(int j=1;j<=i;j++)
		{
			System.out.print((a++)+" ");
		}
		System.out.println();
	}
  }
}


/*
	Enter no. of rows:5
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
*/