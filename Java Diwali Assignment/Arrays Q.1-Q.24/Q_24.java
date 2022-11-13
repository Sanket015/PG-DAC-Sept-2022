//Q.24. Write a program to find second largest element in a given Array in java?
import java.util.*;
class Q_24
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
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Second largest element in Array is: "+arr[arr.length-2]);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_24
Enter size of Array : 5
Enter elements of Array : 5 4 3 2 1
Second largest element in Array is: 4

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_24
Enter size of Array : 5
Enter elements of Array : 1 3 5 2 4
Second largest element in Array is: 4
*/