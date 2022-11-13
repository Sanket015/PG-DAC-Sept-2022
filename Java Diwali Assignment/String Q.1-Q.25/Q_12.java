//Q.12. For example, if the input is "Java is Great" and asked to replace space with %20 then it 
//		should be "Java%20is%20Great".
import java.util.*;
class Q_12
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
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_12
Enter String : Sanket Raut
Output String : Sanket%20Raut
*/