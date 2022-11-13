//Q.2. Write a Java program to insert an element into the array list at the first position.
import java.util.*;
class Q_2
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
		
		colour.add(0,"Blue");
		
		System.out.println();
		System.out.println("After Adding Blue to 1st position :");
		display(colour);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_2
How many element you want to add :3
enter element :
Green
Black
Blue

Colour ArrayList Elements :
Green
Black
Blue

After Adding Blue to 1st position :
Colour ArrayList Elements :
Blue
Green
Black
Blue
*/
