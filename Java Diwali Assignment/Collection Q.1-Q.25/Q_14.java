//Q.14. Write a Java program to replace an element in a linked list.
import java.util.*;
class Q_14
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
		System.out.println("Enter Position to replace value :");
		int pos=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter new Value :");
		String val=sc.nextLine();
		colour.set(pos-1,val);
		System.out.println();
		System.out.println("After Replacing ");
		display(colour);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_14
How many element you want to add :3
enter element :
red
green
black

Colour ArrayList Elements :
Element 1 = red
Element 2 = green
Element 3 = black

Enter Position to replace value :
2
Enter new Value :
blue

After Replacing
Colour ArrayList Elements :
Element 1 = red
Element 2 = blue
Element 3 = black
*/