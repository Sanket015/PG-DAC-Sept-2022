// Assignment No.2_1

import java.util.Scanner;

class P8
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
			System.out.print(j+" ");
		}
		System.out.println();
	}
  }
}

/*
	Enter no. of rows:5
        5
       4 5
      3 4 5
     2 3 4 5
    1 2 3 4 5
*/