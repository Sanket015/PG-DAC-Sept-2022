//Q.8. Write a Java program to append the specified element to the end of a linked list.
import java.util.*;
class Q_8
{
	static void display(LinkedList<String> colour)
	{
		System.out.println("Colour ArrayList Elements :");
		for(String s : colour)
			System.out.println(s);
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
		
		colour.addLast("White");
		
		System.out.println();
		System.out.println("After Adding White to last position :");
		display(colour);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_8
How many element you want to add :3
enter element :
pink
green
blue

Colour ArrayList Elements :
pink
green
blue

After Adding White to last position :
Colour ArrayList Elements :
pink
green
blue
White
*/