// Assignment No.2_1

import java.util.Scanner;

class P16
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. of rows:");
	int r = sc.nextInt();
	
	
	for(int i=1;i<=r;i++)
	{
		for(int j=r;j>=(r+1)-i;j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
  }
}


/*
	Enter no. of rows:5
    5
    5 4
    5 4 3
    5 4 3 2
    5 4 3 2 1
*/