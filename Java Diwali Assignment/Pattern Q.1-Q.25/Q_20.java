class Q_20
{
	public static void main(String[] args)
	{
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<7-i;j++)
			{
				System.out.print((i+j+1)+" ");
			}
			System.out.println();
		}
		for(int i=1;i<7;i++)
		{
			for(int j=1;j<7-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<i+1;j++)
			{
				System.out.print((7+j-i)+" ");
			}
			System.out.println();
		}		
	}
}


/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>javac Q_20.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>java Q_20
1 2 3 4 5 6 7
  2 3 4 5 6 7
    3 4 5 6 7
      4 5 6 7
        5 6 7
          6 7
            7
          6 7
        5 6 7
      4 5 6 7
    3 4 5 6 7
  2 3 4 5 6 7
1 2 3 4 5 6 7
*/