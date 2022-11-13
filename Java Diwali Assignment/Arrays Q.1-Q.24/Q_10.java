//Q.10. Given an array of integers, print whether the numbers are in ascending order or in 
//		descending order or in random order without sorting
import java.util.*;
class Q_10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter elements of Array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The array's order is: ");
		int asc =0, dsc=0;
		for(int i=0; i<arr.length-1; i++)
		{
			if( arr[i]<arr[i+1] )
			{
				asc++;				
			}
			else if( arr[i]>arr[i+1] )
			{
				dsc++;				
			}	
		}	
		if(asc == size-1)
			System.out.print("Ascending");
		else if(dsc == size-1)
			System.out.print("Descending");
		else
			System.out.print("Random");
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_10
Enter size of Array : 5
Enter elements of Array : 5 14 35 90 139
The array's order is: Ascending

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_10
Enter size of Array : 5
Enter elements of Array : 88 67 35 14 -12
The array's order is: Descending

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_10
Enter size of Array : 5
Enter elements of Array : 65 14 129 34 7
The array's order is: Random
*/