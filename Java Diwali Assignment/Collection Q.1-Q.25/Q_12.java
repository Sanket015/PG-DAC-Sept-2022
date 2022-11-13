//Q.12. Write a Java program to check if a particular element exists in a linked list
import java.util.*;
class Q_12
{
	static void display(LinkedList<String> colour)
	{
		System.out.println("Colour ArrayList Elements :");
		for(int i=0;i<colour.size();i++)
		{
			System.out.println("Element "+(i+1)+" = "+colour.get(i));
		}
	}
	public static void main(String[] args)
	{
		LinkedList<String> colour=new LinkedList<>();
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
		System.out.print("Enter element to search :");
		String key=sc.nextLine();
		
		if(!colour.contains(key))
		{
			System.out.println(key+" is not found.");
		}
		else
		{
			System.out.println(key+" is found.");
			
		}
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_12
How many element you want to add :3
enter element :
red
green
blue

Colour ArrayList Elements :
Element 1 = red
Element 2 = green
Element 3 = blue

Enter element to search :red
red is found.
*/