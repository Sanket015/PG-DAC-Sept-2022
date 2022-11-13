//Q.25. Write a Java program to get the value of a specified key in a map
import java.util.*;
class Q_25
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
		
		System.out.print("HashMap Elements = ");
		System.out.println(colour);
		
		System.out.print("Enter Key value to retrieve : ");
		key=sc.nextInt();
		System.out.print("Value at position "+key+" = "+colour.get(key));
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_25
How many element you want to add :3
Enter elements :
1 red
2 green
3 yellow

HashMap Elements = {1= red, 2= green, 3= yellow}
Enter Key value to retrieve : 2
Value at position 2 =  green
*/