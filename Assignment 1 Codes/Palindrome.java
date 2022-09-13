//Q.17

import java.util.Scanner;

class Palindrome
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number:");
	int num = sc.nextInt();
	int check=num;
	int dig=0,a=0;
    if(num<=0)
	{
		System.out.println("Enter Positive Number of terms and try again...");
	}
	else
	{
		while(num>0)
		{
			dig=num%10;
			num=num/10;
			a=a*10+dig;
		}
		if(check==a)
		{
			System.out.println(check+" is a Palindrome.");
		}
		else
		{
			System.out.println(check+" is not a Palindrome.");
		}
	}
		
  }
}

/*
Enter a Number:121
121 is a Palindrome.
---------------------------------------
Enter a Number:111
111 is a Palindrome.
---------------------------------------
Enter a Number:1234
1234 is not a Palindrome.
---------------------------------------
Enter a Number:654456
654456 is a Palindrome.
*/