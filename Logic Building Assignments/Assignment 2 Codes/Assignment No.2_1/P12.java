// Assignment No.2_1

import java.util.Scanner;

class P12
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. of rows:");
	int r = sc.nextInt();
	
	
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=(r-i);j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
  }
}

/*
	Enter no. of rows:5
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
*/