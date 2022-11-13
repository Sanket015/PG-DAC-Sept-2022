class Q_2
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
				if(i==1 && j==1 || i==1 && j==2 || i==2 && j==1)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
				if(i==0)
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
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>javac Q_2.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>java Q_2
* * * * * * * * *
 *     *
  *   *
   * *
    *
*/