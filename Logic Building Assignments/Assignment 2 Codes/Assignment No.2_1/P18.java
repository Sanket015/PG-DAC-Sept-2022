// Assignment No.2_1

import java.util.Scanner;

class P18
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. of rows:");
	int r = sc.nextInt();
	
	
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=(r+1)-i;j++)
		{
			System.out.print((char)(j+64)+" ");
		}
		System.out.println();
	}
  }
}


/*
	Enter no. of rows:5
    A B C D E
    A B C D
    A B C
    A B
    A
*/