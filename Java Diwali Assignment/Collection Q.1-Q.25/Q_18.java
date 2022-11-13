//Q.18. Write a Java program to compare two sets and retain elements which are same on both sets.
import java.util.*;
class Q_18
{
	static void display(HashSet<String> colour)
	{
		Iterator<String> it = colour.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args)
	{
		HashSet<String> colour = new HashSet<>();
		HashSet<String> colour1 = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("How many element you want to add in First Set :");
		int n = sc.nextInt();
		sc.nextLine();
		String str;
		System.out.println("Enter First Set elements :");
		for(int i=0;i<n;i++)
		{
			str = sc.nextLine();
			colour.add(str);
		}	
		System.out.print("How many element you want to add in Second Set :");
		n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter First Set elements :");
		for(int i=0;i<n;i++)
		{
			str = sc.nextLine();
			colour1.add(str);
		}
		System.out.println();
		
		System.out.println("First HastSet Elements :");
		display(colour);
		System.out.println("Second HastSet Elements :");
		display(colour1);
		
		colour.retainAll(colour1);
		System.out.println("After Retain Operation :"); 
		display(colour);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_18
How many element you want to add in First Set :3
Enter First Set elements :
red
green
pink
How many element you want to add in Second Set :3
Enter First Set elements :
yellow
red
pink

First HastSet Elements :
red
pink
green
Second HastSet Elements :
red
pink
yellow
After Retain Operation :
red
pink
*/
