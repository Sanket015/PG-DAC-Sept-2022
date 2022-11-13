class Q_16
{
	public static void main(String[] args)
	{ 
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<4-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}		
		for(int i=2;i<7;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<6-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=4;i<9;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<8-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=6;i<11;i++)
		{
			for(int j=0;j<1;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<10-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=8;i<13;i++)
		{
			for(int j=0;j<12-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<4;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}


/*
Output:
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>javac Q_16.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Pattern Q.1-Q.25>java Q_16
            *
           * *
          * * *
         * * * *
        * * * * *
          * * *
         * * * *
        * * * * *
       * * * * * *
      * * * * * * *
        * * * * *
       * * * * * *
      * * * * * * *
     * * * * * * * *
    * * * * * * * * *
      * * * * * * *
     * * * * * * * *
    * * * * * * * * *
   * * * * * * * * * *
  * * * * * * * * * * *
    * * * * * * * * *
   * * * * * * * * * *
  * * * * * * * * * * *
 * * * * * * * * * * * *
* * * * * * * * * * * * *
         * * * *
         * * * *
         * * * *
         * * * *
*/