//Q.17. Write a Java program to convert a hash set to an array.
import java.util.*;
class Q_17
{
	static void display(HashSet<String> colour)
	{
		System.out.println("HastSet Elements :");
		Iterator<String> it = colour.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		HashSet<String> colour = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("How many element you want to add :");
		int n = sc.nextInt();
		sc.nextLine();
		String str;
		System.out.println("Enter elements :");
		for(int i=0;i<n;i++)
		{
			str=sc.nextLine();
			colour.add(str);
		}	
		
		System.out.println();
		display(colour);
		
		String[] hash = new String[colour.size()];
		colour.toArray(hash);
		System.out.println("After Coverting HashSet to Array :"); 
		for(String s : hash)
		{
			System.out.print(s+"  ");
		}
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_17
How many element you want to add :3
Enter elements :
red
blue
black

HastSet Elements :
red
blue
black

After Coverting HashSet to Array :
red  blue  black
*/