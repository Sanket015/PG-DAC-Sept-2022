//Q.23. Write a Java program to convert a priority queue to an array containing all of the elements of the queue
import java.util.*;
class Q_23
{
	public static void main(String[] args)
	{
		PriorityQueue<String> colour = new PriorityQueue<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("How many element you want to add :");
		int n = sc.nextInt();
		sc.nextLine();
		String str;
		System.out.println("Enter elements :");
		for(int i=0;i<n;i++)
		{
			str = sc.nextLine();
			colour.add(str);
		}	
		
		System.out.println();
		System.out.print("PriorityQueue Element = ");
		System.out.println(colour);
		System.out.println();
		
		String[] pq = new String[colour.size()];
		colour.toArray(pq);
		System.out.println("After PriorityQueue to Array Operation : "); 
		for(String s : pq)
		{
			System.out.print(s+"  ");
		}
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_23
How many element you want to add :3
Enter elements :
red
green
black

PriorityQueue Element = [black, red, green]

After PriorityQueue to Array Operation :
black  red  green
*/