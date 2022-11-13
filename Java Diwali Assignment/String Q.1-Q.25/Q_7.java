//Q.7. You need to write a program to print all duplicate character and their count in Java. For 
//		example, if given String is "Programming" then your program should print
//		g : 2  r : 2  m : 2

import java.util.*;

class Q_7
{  
	public static void duplicate(char[] ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			int count = 1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
				}
			}
			if(count > 1)
			{
				System.out.println(ch[i]+" : "+count);
			}
		}
	}
	public static void main(String[] args) 
	{  
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str1 = sc.nextLine();  
		char[] ch = str1.toCharArray();
		Arrays.sort(ch);
		duplicate(ch);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_7
Enter a String : Programming
g : 2
m : 2
r : 2
*/