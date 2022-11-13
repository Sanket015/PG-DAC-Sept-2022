//Q.9. Write a Java program to insert the specified element at the specified position in the linked list.
import java.util.*;
class Q_9
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
		
		System.out.println("Enter new Element :");
		String key=sc.nextLine();
		System.out.println("Enter new Element position :");
		int pos=sc.nextInt();
		colour.add(pos-1,key);
		System.out.println();
		display(colour);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_9
How many element you want to add :3
enter element :
green
blue
pink

Colour ArrayList Elements :
green
blue
pink

Enter new Element :
black
Enter new Element position :
2

Colour ArrayList Elements :
green
black
blue
pink
*/
