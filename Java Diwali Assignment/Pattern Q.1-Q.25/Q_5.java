class Q_5
{
	public static void main(String[] args)
	{ 
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i+1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}	
		for(int i=1;i<4;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<4-i;j++)
			{
				System.out.print((4-j-i)+" ");
			}
			for(int j=1;j<4-i;j++)
			{
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}			
	}
}


/*
Output:
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25javac Q_5.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25java Q_5
      1
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4
  3 2 1 2 3
    2 1 2
      1
*/