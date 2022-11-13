//Q.4. Write a Java program to sort a given array list.

import java.util.*;
class Q_4
{
	static void display(ArrayList<String> colour)
	{
		System.out.println("Colour ArrayList Elements :");
		for(String s : colour)
			System.out.println(s);
	}
	public static void main(String[] args)
	{
		ArrayList<String> colour = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("How many element you want to add :");
		int n=sc.nextInt();
		sc.nextLine();
		String str;
		System.out.println("enter element :");
		for(int i=0;i<n;i++)
		{
			str=sc.nextLine();
			colour.add(str);
		}	
		
		System.out.println();
		System.out.println("Before sorting :");
		display(colour);
		System.out.println();
		System.out.println("After sorting :");
		Collections.sort(colour);  
		display(colour);
		
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_4
How many element you want to add :3
enter element :
red
black
blue

Before sorting :
Colour ArrayList Elements :
red
black
blue

After sorting :
Colour ArrayList Elements :
black
blue
red
*/