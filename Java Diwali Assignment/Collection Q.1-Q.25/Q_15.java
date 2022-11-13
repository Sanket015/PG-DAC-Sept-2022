//Q.15. Write a Java program to iterate through all elements in a hash list.

import java.util.*;
class Q_15
{
	static void display(HashSet<String> colour)
	{
		System.out.println("HastSet Elements :");
		Iterator<String> it = colour.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args)
	{
		HashSet<String> colour = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("How many element you want to add :");
		int n = sc.nextInt();
		sc.nextLine();
		String str;
		System.out.println("Enter elements :");
		for(int i=0;i<n;i++)
		{
			str = sc.nextLine();
			colour.add(str);
		}	
		
		System.out.println();
		display(colour);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_15
How many element you want to add :3
Enter elements :
red
green
pink

HastSet Elements :
red
pink
green
*/