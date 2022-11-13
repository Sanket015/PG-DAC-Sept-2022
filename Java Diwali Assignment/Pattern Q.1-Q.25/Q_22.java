class Q_22
{
	public static void main(String[] args)
	{
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<6-i;j++)
			{
				System.out.print(1+" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print((i+1)+" ");
			}
			System.out.println();
		}		
	}
}


/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>javac Q_22.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>java Q_22
1 1 1 1 1 1 1
1 1 1 1 1 2 2
1 1 1 1 3 3 3
1 1 1 4 4 4 4
1 1 5 5 5 5 5
1 6 6 6 6 6 6
7 7 7 7 7 7 7
*/