//Q.11

import java.util.Scanner;

class SmallestNumber
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a 1st Number:");
	int a = sc.nextInt();
	System.out.print("Enter a 2nd Number:");
	int b = sc.nextInt();
	System.out.print("Enter a 3rd Number:");
	int c = sc.nextInt();
	
	if(a<b&&a<c)
	{
		System.out.println("The 1st Number "+a+" is Smallest Number");
	}
	else if(b<a&&b<c)
	{
		System.out.println("The 2nd Number "+b+" is Smallest Number");
	}
	else
	{
		System.out.println("The 3rd Number "+c+" is Smallest Number");
	}
		
  }
}

/*
Enter a 1st Number:10
Enter a 2nd Number:11
Enter a 3rd Number:12
The 1st Number 10 is Smallest Number
--------------------------------------------
Enter a 1st Number:11
Enter a 2nd Number:10
Enter a 3rd Number:12
The 2nd Number 10 is Smallest Number
--------------------------------------------
Enter a 1st Number:-10
Enter a 2nd Number:-11
Enter a 3rd Number:-12
The 3rd Number -12 is Smallest Number
*/