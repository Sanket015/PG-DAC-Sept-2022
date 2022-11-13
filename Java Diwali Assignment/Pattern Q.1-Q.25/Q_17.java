class Q_17
{
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>javac Q_17.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>java Q_17
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
*/