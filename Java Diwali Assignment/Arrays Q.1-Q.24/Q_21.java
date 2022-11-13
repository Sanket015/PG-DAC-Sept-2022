//Q.21. How to convert Array to ArrayList in java ?
import java.util.*;

public class Q_21 
{
	public static void main(String args[]) 
	{
		System.out.print("Enter Array Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		Integer[] arr=new Integer[size];
		System.out.print("Enter Array Elements :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();

		System.out.println("Conversion using asList() method ");
		List<Integer> list1 = Arrays.asList(arr);          
		System.out.print(list1);
		System.out.println();

		System.out.println("Conversion using addAll() method ");
		List<Integer> list2 = new ArrayList<Integer>();
		Collections.addAll(list2,arr);
		System.out.print(list2);
		System.out.println();
		
		
		List<Integer> list3 = new ArrayList<Integer>();
		System.out.println("Conversion using add() method ");
		for(int a : arr) 
		{
			list3.add(a);
		}
		System.out.print(list3);
		System.out.println();
	}  
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_21
Enter Array Size :5
Enter Array Elements :1 3 2 5 4

Conversion using asList() method
[1, 3, 2, 5, 4]
Conversion using addAll() method
[1, 3, 2, 5, 4]
Conversion using add() method
[1, 3, 2, 5, 4]
*/
