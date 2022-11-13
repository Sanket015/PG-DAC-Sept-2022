//Q.20. Write a program to remove a given character from String?
import java.util.*;
class Q_20
{	
	public static void removeChar(String str, char c)
	{
		int j = 0, count = 0, n = str.length();
		char []temp = str.toCharArray();
		for (int i = 0; i < n; i++)
		{
			if (temp[i] != c)
			temp[j++] = temp[i];
			else
				count++;
		}
		while(count > 0)
		{
			temp[j++] = '\0';
			count--;
		}
		System.out.println(temp);
	}

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		System.out.print("Enter a Character to be removed : ");
		char c = sc.nextLine().charAt(0);
	
		System.out.print("String after removing \""+c+"\" character from \""+str+"\" : ");
		removeChar(str,c);
		System.out.println();
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_20
Enter a String : Sanket
Enter a Character to be removed : n
String after removing "n" character from "Sanket" : Saket
*/
