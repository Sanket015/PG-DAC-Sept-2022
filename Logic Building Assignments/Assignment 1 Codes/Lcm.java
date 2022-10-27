//Q.15

import java.util.Scanner;

class Lcm
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a 1st Number:");
	int a = sc.nextInt();
	System.out.print("Enter a 2nd Number:");
	int b = sc.nextInt();
	int gcd=0,lcm=0;
	if(a<0||b<0)
	{
		System.out.print("Please Enter a Positive Number and try again...");
	}
	else
	{
		if(a==b)
		{
			System.out.print("L.C.M= "+a);
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
			lcm=(a*b)/gcd;
		    System.out.print("L.C.M= "+lcm);
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
			lcm=(a*b)/gcd;
		    System.out.print("L.C.M= "+lcm);
	    }
	}					
  }
}

/*
Enter a 1st Number:10
Enter a 2nd Number:5
L.C.M= 10
-----------------------------------
Enter a 1st Number:30
Enter a 2nd Number:60
L.C.M= 60
-----------------------------------
Enter a 1st Number:100
Enter a 2nd Number:5
L.C.M= 100
-----------------------------------
Enter a 1st Number:55
Enter a 2nd Number:35
L.C.M= 385
*/
