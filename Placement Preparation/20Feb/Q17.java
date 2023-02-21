import java.util.Scanner;

//17. Write a java program to LCM of TWO given number. 

public class Q17
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1st Number:");
	    int a = sc.nextInt();
	    System.out.print("Enter a 2nd Number:");
	    int b = sc.nextInt();
	    int gcd = 1;
		int lcm = 1;
	    if(a < 0 || b < 0)
	    {
	    	System.out.print("Please Enter a Positive Number and try again...");
	    }
	    else
	    {
	    	if(a == b)
	    	{
	    		gcd = a;
	    	}
            else if(a < b)
	        {
		    	for(int i=1;i<=a;i++)
		        {
			    	if(a%i == 0 && b%i == 0)
			        {
			    		gcd = i;
			        }
				}
	        }
	        else
	        {
			    for(int i=1;i<=b;i++)
		        {
			    	if(a%i == 0 && b%i == 0)
			        {
			    	    gcd = i;
			        }
		        }
	        }
	    }

		lcm = (a*b)/gcd;
		System.out.println("LCM of "+a+" and "+b+" is "+lcm);	
    }
}