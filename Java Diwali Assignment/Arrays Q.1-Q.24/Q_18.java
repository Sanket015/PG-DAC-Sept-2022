//Q.18. How to find duplicate elements in a given Array.
import java.util.*;
class Q_18
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
		
		int[] temp = new int[size];
		int k = 0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					temp[k] = arr[i];
					k++;
				}
			}
		}
		System.out.print("Duplicate elements in Array are : ");
		for(int i=0;i<k;i++)
		{
			System.out.print(temp[i]+" ");
		}
		System.out.println();
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_18
Enter size of Array : 10
Enter elements of Array : 1 1 2 4 3 3 5 6 6 4
Duplicate elements in Array are : 1 4 3 6
*/