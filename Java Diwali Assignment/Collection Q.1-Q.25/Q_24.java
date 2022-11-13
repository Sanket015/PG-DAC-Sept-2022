//Q.24. Write a Java program to check whether a map contains key-value mappings (empty) or not
import java.util.*;
class Q_24
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
		
		if(colour.isEmpty())
		{
			System.out.println("Key Value is Empty");
		}
		System.out.print("Key Value is ");
		System.out.println(colour);
		
		colour.clear();
		System.out.print("After Clear operation : ");
		if(colour.isEmpty())
		{
			System.out.println("Key Value is Empty");
		}
		else
		{
			System.out.print("Key Value is ");
			System.out.println(colour);
		}
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_24
How many element you want to add :3
Enter elements :
1 red
2 green
3 white

Key Value is {1= red, 2= green, 3= white}
After Clear operation : Key Value is Empty
*/
