//Q.23. How to sort String on their length in Java? 
import java.util.*;
class Q_23
{
	static void sort(String []s, int n)
	{
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
	}
	static void printArraystring(String str[], int n)
	{
		for (int i=0; i<n; i++)
			System.out.print(str[i]+" ");
	}

	public static void main(String args[])
	{
		
		String []arr = {"Java","beginners","we","are"};
		System.out.print("before sorting : ");
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.print("After sorting :");
		int n = arr.length;
		sort(arr,n);
		printArraystring(arr, n);
		
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_23
before sorting : Java beginners we are
After sorting :we are Java beginners
*/
