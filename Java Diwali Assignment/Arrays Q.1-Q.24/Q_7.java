//Q.7. Write a program to merge two arrays of integers by reading one number at a time from 
//	   each array until one of the array is exhausted, and then concatenating the remaining numbers
//		Input: [23,60,94,3,102] and [42,16,74]
//		Output: [23,42,60,16,94,74,3,102]

import java.util.*;
class Q_7
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
		
		System.out.print("Enter size of 2nd Array : ");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		System.out.print("Enter elements of 2nd Array : ");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		int[] arr3 = new int[size1 + size2];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<arr1.length && j<arr2.length)
		{
			arr3[k++] = arr1[i++];
			arr3[k++] = arr2[j++];
		}
		while(i<arr1.length)
		{
			arr3[k++] = arr1[i++];
		}
		while(j<arr2.length)
		{
			arr3[k++] = arr2[j++];
		}
		
		System.out.print("Merged array is : ");
		for(i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_7
Enter size of 1st Array : 5
Enter elements of 1st Array : 23 60 94 3 102
Enter size of 2nd Array : 3
Enter elements of 2nd Array : 42 16 74
Merged array is : 23 42 60 16 94 74 3 102
*/
