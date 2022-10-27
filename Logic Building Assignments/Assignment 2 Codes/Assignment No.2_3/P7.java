// Assignment No.2_3

import java.util.Scanner;

class P7
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. of rows:");
	int r = sc.nextInt();
	
	
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=(r+1)-i;j++)
		{
			System.out.print((r+1)-i+" ");
		}
		System.out.println();
	}
  }
}
	
	
/*
	Enter no. of rows:9
    9 9 9 9 9 9 9 9 9
     8 8 8 8 8 8 8 8
      7 7 7 7 7 7 7
       6 6 6 6 6 6
        5 5 5 5 5
         4 4 4 4
          3 3 3
           2 2
            1
*/