//Q.22. How to convert Array to TreeSet in java ? 
import java.util.*;
 
public class Q_22 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Array Size :");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Integer[] arr = new Integer[size];
		System.out.print("Enter Array Elements :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
	
		for(int a : arr)
		{
			ts.add(a);
		}
		
		System.out.println("TreeSet contains: " + ts);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_22
Enter Array Size :5
Enter Array Elements :1 4 2 5 7
TreeSet contains: [1, 2, 4, 5, 7]
*/