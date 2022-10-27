// Assignment No.2_3

import java.util.Scanner;

class Assignment2_3
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. of rows:");
	int r = sc.nextInt();
	
	//1
	/*
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
	*/
	
	/*
	Enter no. of rows:9
            1
           2 2
          3 3 3
         4 4 4 4
        5 5 5 5 5
       6 6 6 6 6 6
      7 7 7 7 7 7 7
     8 8 8 8 8 8 8 8
    9 9 9 9 9 9 9 9 9
	*/
	
	//2
	/*
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
	*/
	
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
	
	//3
	/*
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=(r-i);j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	*/
	
	/*
	Enter no. of rows:9
            *
           * *
          * * *
         * * * *
        * * * * *
       * * * * * *
      * * * * * * *
     * * * * * * * *
    * * * * * * * * *
	*/
	
	//4
	/*
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=(r-i);j++)
		{
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		for(int j=(i-1);j>=1;j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	*/
	
	/*
	Enter no. of rows:9
                    1
                  1 2 1
                1 2 3 2 1
              1 2 3 4 3 2 1
            1 2 3 4 5 4 3 2 1
          1 2 3 4 5 6 5 4 3 2 1
        1 2 3 4 5 6 7 6 5 4 3 2 1
      1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
    1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
    */
	
	//5
	/*
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
	*/
	
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
	
	//6
	/*
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=(r+1)-i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	*/
	
	/*
	Enter no. of rows:9
    * * * * * * * * *
     * * * * * * * *
      * * * * * * *
       * * * * * *
        * * * * *
         * * * *
          * * *
           * *
            *
	*/
	
	//7
	/*
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
	*/
	
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
  }
}