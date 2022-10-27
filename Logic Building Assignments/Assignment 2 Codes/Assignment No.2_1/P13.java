// Assignment No.2_1

import java.util.Scanner;

class P13
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
			System.out.print((char)(i+64)+" ");
		}
		System.out.println();
	}
  }
}


/*
	Enter no. of rows:5
        A
       B B
      C C C
     D D D D
    E E E E E
*/