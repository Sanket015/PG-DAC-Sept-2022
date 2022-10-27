// Assignment No.2_3

import java.util.Scanner;

class P5
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
			System.out.print("  ");
		}
		for(int j=(r+1)-i;j<=r;j++)
		{
			System.out.print(j+" ");
		}
		for(int j=(r-1);j>=(r+1)-i;j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
  }
}
	
	
/*
	Enter no. of rows:9
                    9
                  8 9 8
                7 8 9 8 7
              6 7 8 9 8 7 6
            5 6 7 8 9 8 7 6 5
          4 5 6 7 8 9 8 7 6 5 4
        3 4 5 6 7 8 9 8 7 6 5 4 3
      2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
    1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
*/