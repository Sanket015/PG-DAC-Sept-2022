//Q.15. How to remove duplicate characters from String?
import java.util.*;
class Q_15
{	
	public static String removeDuplicate(char[] ch, int n)
	{
		int index=0;
		for(int i=0;i<n;i++)
		{
			int j;
			for(j=0;j<i;j++)
			{
				if(ch[i] == ch[j])
				{
					break;
				}
			}
			if(j==i)
			{
				ch[index++] = ch[i];
			}
		}
		return String.valueOf(Arrays.copyOf(ch, index));
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		int n = str.length();
		String newStr = removeDuplicate(ch,n);
		System.out.println("String after deleting duplicate characters : "+newStr);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_15
Enter a String : hhelloooe
String after deleting duplicate characters : helo

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_15
Enter a String : bananas
String after deleting duplicate characters : bans
*/