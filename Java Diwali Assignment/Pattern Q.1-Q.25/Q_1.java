class Q_1
{
	public static void main(String[] args)
	{ 
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				
				if(i==2 && j==1 || i==3 && j==1 || i==3 && j==2)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
				if(i==4)
				{
					if(j==4)
						continue;
					System.out.print("* ");
				}
			}
			System.out.println();
		}		
	}
}

/*
Output:
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>javac Q_1.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>java Q_1
    *
   * *
  *   *
 *     *
* * * * * * * * *
*/