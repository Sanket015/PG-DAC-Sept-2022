//Q.16. Given two arrays, find the intersection between them? 
import java.util.*;
class Q_16
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of 1st Array : ");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		
		System.out.print("Enter elements of 1st Array : ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.print("Enter size of  2nd Array : ");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		
		System.out.print("Enter elements of  2nd Array : ");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		int k = 0;
		int[] temp = new int[size1];
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				if(arr1[i] == arr2[j])
				{
					temp[k] = arr1[i];
					k++;
				}
			}
		}
		System.out.print("Intersection of 2 Arrays is : ");
		for(int i=0;i<k;i++)
		{
			System.out.print(temp[i]+" ");
		}
		System.out.println();
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_16
Enter size of 1st Array : 5
Enter elements of 1st Array : 1 2 3 4 5
Enter size of  2nd Array : 4
Enter elements of  2nd Array : 2 4 6 8
Intersection of 2 Arrays is : 2 4
*/