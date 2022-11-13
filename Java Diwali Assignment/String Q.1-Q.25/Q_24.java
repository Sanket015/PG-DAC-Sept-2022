//Q.24. Write a Program to sort String on their length in Java? Your method should accept an 
//		array of String and return a sorted array based upon the length of String. Don't forget to 
//		write unit tests for your solution.
import java.util.*;
class Q_24
{
	static String[] sort(String []s)
	{
		int n = s.length;
		for (int i=1 ;i<n; i++)
		{
			String temp = s[i];

			// Insert s[j] at its correct position
			int j = i - 1;
			while (j >= 0 && temp.length() < s[j].length())
			{
				s[j+1] = s[j];
				j--;
			}
			s[j+1] = temp;
		}
		return s;
	}
	static void printArraystring(String str[])
	{
		int n = str.length;
		for (int i=0; i<n; i++)
		{
			System.out.print(str[i]+" ");
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		
		String []arr = {"Java","beginners","we","are"};
		System.out.print("before sorting : ");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("After sorting :");
		String[] sorted_arr = sort(arr);
		printArraystring(sorted_arr);
		
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_24
before sorting : Java beginners we are
After sorting :we are Java beginners
*/