//Q.1. How to Print duplicate characters from String?
import java.util.*;

class Q_1
{  
	public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String :");
		String str1=sc.nextLine();  
		int count;  
		  
		char[] ch = str1.toCharArray();  
		  
		System.out.print("Duplicate characters in a given string: ");  
		for(int i=0;i<ch.length;i++) 
		{  
			count=1;  
			for(int j=i+1;j<ch.length;j++) 
			{  
				if(ch[i] == ch[j] && ch[i] != ' ') 
				{  
					count++;   
					ch[j] = '0';  
				}  
			}  
			
			if(count > 1 && ch[i] != '0')
			{
				System.out.print(ch[i]+"  ");
			}
		}  
	}  
} 

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_1
Enter a String :Sanket Raut
Duplicate characters in a given string: a  t
*/