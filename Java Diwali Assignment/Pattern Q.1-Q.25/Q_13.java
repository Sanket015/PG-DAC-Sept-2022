class Q_13
{
	public static void main(String[] args)
	{
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				if((i==2 && j==1) || (i==3 && (j==1 || j==2)) || (i==4 && (j==1 || j==2 || j==3)) || (i==5 && (j==1 || j==2 || j==3 || j==4)))
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print((char)(65+i)+" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<6;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<6-i;j++)
			{
				if((i==1 && (j==1 || j==2 || j==3)) || (i==2 && (j==1 || j==2)) || (i==3 && j==1))
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print((char)(70-i)+" ");
				}
			}
			System.out.println();
		}
	}
}

/*
Output:
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25javac Q_13.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25java Q_13
     A
    B B
   C   C
  D     D
 E       E
F         F
 E       E
  D     D
   C   C
    B B
     A
*/