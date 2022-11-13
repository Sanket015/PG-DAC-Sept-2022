//Q.19. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
import java.util.*;
class Q_19
{
	public static void main(String[] args)
	{
		TreeSet<String> colour = new TreeSet<>();
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
		
		System.out.print("TreeSet Elements =  ");
		System.out.println(colour);
		
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_19
How many element you want to add :3
Enter elements :
red
green
black
TreeSet Elements =  [black, green, red]
*/
