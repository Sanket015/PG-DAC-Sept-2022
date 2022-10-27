// Assignment No.2_1

import java.util.Scanner;

class Assignment2_1
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
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	*/
	/*
	Enter no. of rows:5
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
	*/
	
	//2
	/*
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(j+64)+" ");
		}
		System.out.println();
	}
	*/
	
	/*
	Enter no. of rows:5
    A
    A B
    A B C
    A B C D
    A B C D E
	*/
	
	//3
	/*
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	*/
	
	/*
	Enter no. of rows:5
    *
    * *
    * * *
    * * * *
    * * * * *
	*/
	
	//4
	/*
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	*/
	/*
	Enter no. of rows:5
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
	*/
	
	//5
	/*
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(i+64)+" ");
		}
		System.out.println();
	}
	*/
	
	/*
	Enter no. of rows:5
    A
    B B
    C C C
    D D D D
    E E E E E
	*/
	
	//6
	/*
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=(r-i);j++)
		{
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	*/
	
	/*
	Enter no. of rows:5
            *
          * *
        * * *
      * * * *
    * * * * *
	*/
	
	//7
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
	Enter no. of rows:5
        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
	*/
	
	//8
	/*
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
	*/
	
	/*
	Enter no. of rows:5
        5
       4 5
      3 4 5
     2 3 4 5
    1 2 3 4 5
	*/
	
	//9
	/*
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=(r-i);j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(j+64)+" ");
		}
		System.out.println();
	}
	*/
	
	/*
	Enter no. of rows:5
        A
       A B
      A B C
     A B C D
    A B C D E
	*/
	
	//10
	/*
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
	*/
	
	/*
	Enter no. of rows:5
        E
       D E
      C D E
     B C D E
    A B C D E
	*/
	
	//11
	/*
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=r-i;j++)
		{
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
        for(int j=1;j<i;j++)
		{
			System.out.print("* ");
		}		
		System.out.println();
	}
	*/
	
	/*
	Enter no. of rows:5
            *
          * * *
        * * * * *  
      * * * * * * *
    * * * * * * * * *
	*/
	
	//12
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
	Enter no. of rows:5
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
	*/
	
	//13
	/*
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
	*/
	
	/*
	Enter no. of rows:5
        A
       B B
      C C C
     D D D D
    E E E E E
	*/
	
	//14
	/*
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=(r+1)-i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	*/
	
	/*
	Enter no. of rows:5
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
	*/
	
	//15
	/*
	for(int i=1;i<=r;i++)
	{
		for(int j=r;j>=i;j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	*/
	
	/*
	Enter no. of rows:5
    5 4 3 2 1
    5 4 3 2
    5 4 3
    5 4
    5
	*/
	
	//16
	/*
	for(int i=1;i<=r;i++)
	{
		for(int j=r;j>=(r+1)-i;j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	*/
	
	/*
	Enter no. of rows:5
    5
    5 4
    5 4 3
    5 4 3 2
    5 4 3 2 1
	*/
	
	//17
	/*
	int a=1;
	for(int i=1;i<=r;i++)
	{
		
		for(int j=1;j<=i;j++)
		{
			System.out.print((a++)+" ");
		}
		System.out.println();
	}
	*/
	
	/*
	Enter no. of rows:5
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
	*/
	
	//18
	/*
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=(r+1)-i;j++)
		{
			System.out.print((char)(j+64)+" ");
		}
		System.out.println();
	}
	*/
	
	/*
	Enter no. of rows:5
    A B C D E
    A B C D
    A B C
    A B
    A
	*/
	
  // -------------------------------------------------------------------
	
  }
}