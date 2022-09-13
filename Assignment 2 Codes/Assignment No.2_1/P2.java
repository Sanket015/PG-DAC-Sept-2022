// Assignment No.2_1

import java.util.Scanner;

class P2
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
			System.out.print((char)(j+64)+" ");
		}
		System.out.println();
	}
  }
}

	/*
	Enter no. of rows:5
    A
    A B
    A B C
    A B C D
    A B C D E
	*/