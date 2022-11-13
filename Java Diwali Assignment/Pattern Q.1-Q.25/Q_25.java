class Q_25
{
	public static void main(String[] args)
	{
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7-i;j++)
			{
				System.out.print((i+j+1)+" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}		
	}
}


/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>javac Q_25.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>java Q_25
1 2 3 4 5 6 7
2 3 4 5 6 7 1
3 4 5 6 7 1 2
4 5 6 7 1 2 3
5 6 7 1 2 3 4
6 7 1 2 3 4 5
7 1 2 3 4 5 6
*/