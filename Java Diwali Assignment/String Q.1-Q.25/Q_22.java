//Q.22. Write a program to find the longest palindrome in a string?
import java.util.*;
public class Q_22
{
	static int longestPalSubstr(String str)
	{
		int n = str.length();
		if (n < 2)
			return n; 

		int maxLength = 1,start=0;
		int low, high;
		for (int i = 0; i < n; i++) 
		{
			low = i - 1;
			high = i + 1;
			while ( high < n && str.charAt(high) == str.charAt(i)) 								
				high++;
		
			while ( low >= 0 && str.charAt(low) == str.charAt(i)) 					
				low--;
		
			while (low >= 0 && high < n && str.charAt(low) == str.charAt(high))
			{
				low--;
				high++;
			}
			int length = high - low - 1;
			if (maxLength < length)
			{
				maxLength = length;
				start=low+1;
			}
		}	
		System.out.print("Longest palindrome substring is: ");
		System.out.println(str.substring(start, start + maxLength ));
		return maxLength;	
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :-");
        String str =sc.nextLine();
		System.out.println("Length is: "+longestPalSubstr(str));
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_22
Enter String :-hiiilliiilliiipjk
Longest palindrome substring is: iiilliiilliii
Length is: 13
*/
