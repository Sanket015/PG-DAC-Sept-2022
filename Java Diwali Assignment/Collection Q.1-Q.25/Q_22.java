//Q.22. Write a Java program to count the number of key-value (size) mappings in a map
import java.util.*;
class Q_22
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> colour = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("How many element you want to add :");
		int n = sc.nextInt();
		sc.nextLine();
		String str;
		Integer key;
		System.out.println("Enter elements :");
		for(int i=0;i<n;i++)
		{
			key = sc.nextInt();
			str = sc.nextLine();
			colour.put(key,str);
		}	
		System.out.println();
		System.out.println("Size of the hash map : "+colour.size());
		
		System.out.print("HashMap Element = ");
		System.out.println(colour);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_22
How many element you want to add :3
Enter elements :
1 red
2 pink
3 green

Size of the hash map : 3
HashMap Element = {1= red, 2= pink, 3= green}
*/