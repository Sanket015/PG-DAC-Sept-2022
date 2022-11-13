class Q_4
{
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4-i;j++)
			{
				System.out.print(" ");
			}
			int num=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num = num*(i-j)/(j+1);
			}
			System.out.println();
		}		
	}
}

/*
Output:
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>javac Q_4.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>java Q_4
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
*/