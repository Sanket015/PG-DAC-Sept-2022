class Q_12
{
	public static void main(String[] args)
	{
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(65+j)+" ");
			}
			System.out.println();
		}		
	}
}


/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>javac Q_12.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>java Q_12
      A
     A B
    A B C
   A B C D
  A B C D E
 A B C D E F
*/
