//Q.6. Write a Java program of swap two elements in an array list.

import java.util.*;
class Q_6
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
		System.out.print("enter two swapping position :");
		int index1=sc.nextInt();
		int index2=sc.nextInt();
		
		System.out.println("Before Swapping :");
		display(colour);
		
		System.out.println();
		System.out.println("After Swapping :");
		Collections.swap(colour,index1-1,index2-1);
		display(colour);
		
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_6
How many element you want to add :3
enter element :
blue
pink
green

enter two swapping position :1
3
Before Swapping :
Colour ArrayList Elements :
blue
pink
green

After Swapping :
Colour ArrayList Elements :
green
pink
blue
*/