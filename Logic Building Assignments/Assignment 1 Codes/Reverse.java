//Q.13

import java.util.Scanner;

class Reverse
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Positive Number:");
	int num = sc.nextInt();
	if(num<=0)
	{
		System.out.println("Enter Positive Number of terms and try again...");
	}
	else
	{
		System.out.print("The Reverse of "+num+" Number:");
		while(num>0)
		{
			System.out.print(num%10);
		    num=num/10;
	    }
    }
  }
}

/*
Enter a Positive Number:55
The Reverse of 55 Number:55
-------------------------------------------------
Enter a Positive Number:434
The Reverse of 434 Number:434
-------------------------------------------------
Enter a Positive Number:543
The Reverse of 543 Number:345
-------------------------------------------------
Enter a Positive Number:-987
Enter Positive Number of terms and try again...
*/
