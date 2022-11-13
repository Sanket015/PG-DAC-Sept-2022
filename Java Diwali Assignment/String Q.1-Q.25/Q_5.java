//Q.5. How to check if a String contains only digits?
import java.util.*;

class Q_5
{  
	public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String :");
		String str1=sc.nextLine(); 
		int count = 0;
		  
		char[] ch = str1.toCharArray();  
		  
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] >= '0' && ch[i] <= '9')
			{
				count++;
			}
		}
		
		if(count == ch.length)
		{
			System.out.println("String contains only Digits.");
		}
		else
		{
			System.out.println("String does not contains only Digits.");
		}
	}  
} 

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_5
Enter a String :1234
String contains only Digits.

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_5
Enter a String :12sanket34
String does not contains only Digits.

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_5
Enter a String :sanket
String does not contains only Digits.
*/