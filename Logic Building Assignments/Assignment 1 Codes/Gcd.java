//Q.14

import java.util.Scanner;

class Gcd
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a 1st Number:");
	int a = sc.nextInt();
	System.out.print("Enter a 2nd Number:");
	int b = sc.nextInt();
	int gcd=0;
	if(a<0||b<0)
	{
		System.out.print("Please Enter a Positive Number and try again...");
	}
	else
	{
		if(a==b)
		{
			System.out.print("G.C.D= "+a);
		}
        else if(a<b)
	    {
			for(int i=1;i<=a;i++)
		    {
				if(a%i==0&&b%i==0)
			    {
					gcd=i;
			    }
		    }
		    System.out.print("G.C.D= "+gcd);
	    }
	    else
	    {
			for(int i=1;i<=b;i++)
		    {
				if(a%i==0&&b%i==0)
			    {
				    gcd=i;
			    }
		    }
		    System.out.print("G.C.D= "+gcd);
	    }
	}					
  }
}

/*
Enter a 1st Number:-10
Enter a 2nd Number:10
Please Enter a Positive Number and try again...
-----------------------------------------------------
Enter a 1st Number:-10
Enter a 2nd Number:-10
Please Enter a Positive Number and try again...
-----------------------------------------------------
Enter a 1st Number:100
Enter a 2nd Number:20
G.C.D= 20
-----------------------------------------------------
Enter a 1st Number:18
Enter a 2nd Number:4
G.C.D= 2
*/