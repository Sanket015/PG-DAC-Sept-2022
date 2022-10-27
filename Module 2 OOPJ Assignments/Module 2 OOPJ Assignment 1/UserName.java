//Q.1.Write a program that takes user’s name as command line argument and prints Welcome <entered user name>.

import java.util.*;

class UserName
{
	public static void main(String[] args)
	{
		String s1= args[0];
		System.out.println(" Welcome "+s1);
	}
}


/*
Output:

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 1>java UserName Sanket
 Welcome Sanket
 
C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 1>java UserName CDAC
 Welcome CDAC
 */