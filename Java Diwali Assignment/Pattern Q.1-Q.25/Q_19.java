class Q_19
{
	public static void main(String[] args)
	{ 
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((j+1)+" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}		
	}
}


/*
Output:
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25javac Q_19.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25java Q_19
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
*/