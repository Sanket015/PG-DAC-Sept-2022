// Assignment No.2_1

import java.util.Scanner;

class P10
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. of rows:");
	int r = sc.nextInt();
	
	
	for(int i=r;i>=1;i--)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=r;j++)
		{
			System.out.print((char)(j+64)+" ");
		}
		System.out.println();
	}
  }
}

/*
	Enter no. of rows:5
        E
       D E
      C D E
     B C D E
    A B C D E
*/