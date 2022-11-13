class Q_24
{
	public static void main(String[] args)
	{ 
		for(int i=1;i<=5;i++)
		{
			int num = i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num = num+5-j;
			}
			System.out.println();
		}		
	}
}

/*
Output:
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>javac Q_24.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>java Q_24
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
*/