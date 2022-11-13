class Q_3
{
	public static void main(String[] args)
	{ 
		int num = 1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++,num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}		
	}
}


/*
Output:
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>javac Q_3.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>java Q_3
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/