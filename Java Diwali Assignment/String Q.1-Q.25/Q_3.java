//Q.3. How to check if two Strings are anagrams of each other? 
import java.util.*;
class Q_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st String : ");
		String str1 = sc.nextLine();
		System.out.print("Enter 2nd String : ");
		String str2 = sc.nextLine();
		
		if(str1.length() == str2.length())
		{
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1,ch2))
			{
				System.out.println(str1+" and "+str2+" are Anagram.");
			}
			else
			{
				System.out.println(str1+" and "+str2+" are not Anagram.");
			}
		}
		else
		{
			System.out.println(str1+" and "+str2+" are not Anagram.");
		}
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_3
Enter 1st String : keep
Enter 2nd String : peek
keep and peek are Anagram.

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_3
Enter 1st String : case
Enter 2nd String : race
case and race are not Anagram.
*/