//Q.3. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.*;
class Q_3
{
	static void display(ArrayList<String> colour)
	{
		System.out.println("Colour ArrayList Elements :");
		for(String s : colour)
			System.out.println(s);
	}
	public static void main(String[] args)
	{
		ArrayList<String> colour=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
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
		display(colour);
		
		System.out.println();
		System.out.print("Which position element you want to print :");
		int index=sc.nextInt();
		System.out.println(colour.get(index-1));
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_3
How many element you want to add :3
enter element :
red
blue
black

Colour ArrayList Elements :
red
blue
black

Which position element you want to print :2
blue
*/