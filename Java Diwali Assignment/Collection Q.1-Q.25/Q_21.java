//Q.21. Write a Java program to remove all the elements from a priority queue.
import java.util.*;
class Q_21
{
	
	public static void main(String[] args)
	{
		PriorityQueue<String> colour = new PriorityQueue<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("How many element you want to add :");
		int n = sc.nextInt();
		sc.nextLine();
		String str;
		System.out.println("Enter Elements :");
		for(int i=0;i<n;i++)
		{
			str = sc.nextLine();
			colour.add(str);
		}	
		
		System.out.println();
		System.out.print("PriorityQueue Element = ");
		System.out.println(colour);
		
		colour.clear();
		
		System.out.print("After Empty Operation : "); 
		System.out.println(colour);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_21
How many element you want to add :3
Enter Elements :
red
pink
yellow

PriorityQueue Element = [pink, red, yellow]
After Empty Operation : []
*/