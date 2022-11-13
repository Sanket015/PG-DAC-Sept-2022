//Q.13. Write a Java program to compare two linked lists.
import java.util.*;
class LinkedListCompare
{
	static void display1(LinkedList<String> colour1)
	{
		System.out.println("Colour ArrayList Elements :");
		for(int i=0;i<colour1.size();i++)
		{
			System.out.println("Element "+(i+1)+" = "+colour1.get(i));
		}
	}
	static void display2(LinkedList<String> colour2)
	{
		System.out.println("Colour ArrayList Elements :");
		for(int i=0;i<colour2.size();i++)
		{
			System.out.println("Element "+(i+1)+" = "+colour2.get(i));
		}
	}
	
	public static void main(String[] args)
	{
		LinkedList<String> colour1=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("How many element you want to add in List1 :");
		int n1=sc.nextInt();
		sc.nextLine();
		String str1;
		System.out.println("enter element :");
		for(int i=0;i<n1;i++)
		{
			str1=sc.nextLine();
			colour1.add(str1);
		}	
		
		LinkedList<String> colour2=new LinkedList<>();
		System.out.print("How many element you want to add in List2 :");
		int n2=sc.nextInt();
		sc.nextLine();
		String str2;
		System.out.println("enter element :");
		for(int i=0;i<n2;i++)
		{
			str2=sc.nextLine();
			colour1.add(str2);
		}	
		
		System.out.println();
		display1(colour1);
		System.out.println();
		
		display2(colour2);
		System.out.println();
		
		LinkedList<String> colour3 = new LinkedList<String>();
        for (String str3 : colour1)
            colour3.add(colour2.contains(str3) ? "Yes" : "No");
        System.out.println(colour3);
	}
}
