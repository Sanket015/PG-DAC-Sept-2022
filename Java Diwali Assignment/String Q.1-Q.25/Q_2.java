//Q.2. For example, if String is "Java" then the program should print "a"
import java.util.*;

class Q_2
{  
	public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str1=sc.nextLine();  
		  
		if(str1.equals("Java"))
		{
			str1 = "a";
			System.out.println("Updated String is : "+str1);
		}			
	}  
} 

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_2
Enter a String :Java
Updated String is : a
*/