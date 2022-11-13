//Q.19. How to return the highest occurred character in a String?
//		For example if input is "aaaaaaaaaaaaaaaaabbbbcddddeeeeee" it should return "a".import java.util.*;
import java.util.*;
class Q_19
{	
	static final int ASCII_SIZE = 256;
	public static char getMaxOccuringChar(String str)
	{
		int count[] = new int[ASCII_SIZE];
		int len = str.length();
		for (int i = 0; i < len; i++)
		{
			count[str.charAt(i)]++;
		}

		int max = -1; 
		char result = ' ';
		for (int i=0;i<len;i++) 
		{
			if (max<count[str.charAt(i)]) 
			{
				max=count[str.charAt(i)];
				result=str.charAt(i);
			}
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		System.out.print("Maximum Occurring character in String \""+str+"\" is : "+getMaxOccuringChar(str));
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_19
Enter a String : aaaaaaaaaaaaaaaaabbbbcddddeeeeee
Maximum Occurring character in String "aaaaaaaaaaaaaaaaabbbbcddddeeeeee" is : a
*/
