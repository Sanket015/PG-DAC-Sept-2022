// Assignment No.2_3

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
		for(int j=1;j<=(r-i);j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
  }
}
	
	
/*
	Enter no. of rows:9
            1
           1 2
          1 2 3
         1 2 3 4
        1 2 3 4 5
       1 2 3 4 5 6
      1 2 3 4 5 6 7
     1 2 3 4 5 6 7 8
    1 2 3 4 5 6 7 8 9
*/