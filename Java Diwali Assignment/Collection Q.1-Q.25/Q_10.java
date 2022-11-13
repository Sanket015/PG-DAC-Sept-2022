//Q.10. Write a Java program to insert elements into the linked list at the first and last position.
import java.util.*;
class Q_10
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
		System.out.println();
		
		System.out.println("Enter First Element :");
		String first=sc.nextLine();
		colour.addFirst(first);
		
		System.out.println("Enter Last Element :");
		String last=sc.nextLine();
		colour.addLast(last);
		System.out.println();
		
		System.out.println("After Adding White to last position :");
		display(colour);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_10
How many element you want to add :3
enter element :
blue
black
green

Colour ArrayList Elements :
blue
black
green

Enter First Element :
red
Enter Last Element :
white

After Adding White to last position :
Colour ArrayList Elements :
red
blue
black
green
white
*/