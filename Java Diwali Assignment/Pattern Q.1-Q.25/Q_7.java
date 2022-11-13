class Q_7
{
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i%2==0)
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
				else
				{
					if(j%2==0)
					{
						System.out.print(0+" ");
					}
					else
					{
						System.out.print(1+" ");
					}
				}
			}
			System.out.println();
		}		
	}
}


/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>javac Q_7.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>java Q_7
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
*/