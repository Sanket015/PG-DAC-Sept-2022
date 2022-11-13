//Q.11. How to replace each given character to other e.g. blank with %20?
import java.util.*;
class Q_11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		
		String str1 = "";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != ' ')
				str1 = str1 + str.charAt(i);
			if(str.charAt(i) == ' ')
				str1 = str1 + "%20";
		}
		System.out.print("Output String : "+str1);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_11
Enter String : Hi Hello Friends
Output String : Hi%20Hello%20Friends
*/