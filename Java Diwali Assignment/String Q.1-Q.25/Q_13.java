//Q.13. How to find all permutations of String?
import java.util.*;
class Q_13
{	
	public static void permute(String str,String res)
	{
		if(str.length() == 0)
		{
			System.out.println(res);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			char r1 = str.charAt(i);
			String r2 = str.substring(0,i)+str.substring(i+1);
			permute(r2,res+r1);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Numeric String : ");
		String str = sc.nextLine();
		System.out.println("All permutations of given String are :");
		permute(str,"");
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_13
Enter Numeric String : ABC
All permutations of given String are :
ABC
ACB
BAC
BCA
CAB
CBA
*/