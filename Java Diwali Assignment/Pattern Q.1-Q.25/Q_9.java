class Q_9
{
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<5-i;j++)
			{
				System.out.print((i+j+1)+" ");
			}
			System.out.println();
		}
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<4-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++)
			{
				System.out.print((5+j-i)+" ");
			}
			System.out.println();
		}		
	}
}


/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>javac Q_9.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>java Q_9
1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
*/