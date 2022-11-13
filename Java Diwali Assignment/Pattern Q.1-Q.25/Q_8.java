class Q_8
{
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}		
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>javac Q_8.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>java Q_8
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
*/