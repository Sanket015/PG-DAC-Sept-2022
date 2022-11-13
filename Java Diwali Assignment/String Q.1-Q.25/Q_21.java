//Q.21. You need to write a Java method that will accept a String and a character to be removed 
//		and return a String, which doesn't has that character e.g remove(String word, char ch).
import java.util.*;
class Q_21
{	
	public static void remove(String str, char c)
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
		remove(str,c);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_21
Enter a String : Sanket123
Enter a Character to be removed : 1
String after removing "1" character from "Sanket123" : Sanket23
*/