//Q.8. How to count the occurrence of a given character in String?
import java.util.*;
class Q_8
{
	public static int count(String str,char c)
	{
		char[] ch = str.toCharArray();
		int count = 0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == c)
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		System.out.print("Enter a character whose occurrence has to count in given string  : ");
		char c = sc.nextLine().charAt(0);
		int count = count(str,c);
		if(count > 0)
		{
			System.out.println("'"+c+"' occurs "+count+" times in String '"+str+"'");
		}
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_8
Enter a String : Programming
Enter a character whose occurrence has to count in given string  : a
'a' occurs 1 times in String 'Programming'

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_8
Enter a String : Programming
Enter a character whose occurrence has to count in given string  : m
'm' occurs 2 times in String 'Programming'

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_8
Enter a String : Programming
Enter a character whose occurrence has to count in given string  : n
'n' occurs 1 times in String 'Programming'
*/