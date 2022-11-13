//Q.14. How to reverse words in a sentence without using a library method?
import java.util.*;
class Q_14
{	
	static String reverse(String str)	//can
	{
		if(str.length() == 0)	//empty string
		{
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);	//rev(an)+c..rev(n)+a+c..n+a+c=nac
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		System.out.print("Reversed String is : "+reverse(str));
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_14
Enter a String : I am Sanket
Reversed String is : teknaS ma I
*/
