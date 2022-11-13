//Q.14. Write a program to check whether two given Arrays are equal, given both contains same 
//		data type and same length ?

import java.util.*;
class Q_14
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
		System.out.println();
		System.out.print("Enter size of  2nd Array : ");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		
		System.out.print("Enter elements of  2nd Array : ");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i] = sc.nextInt();
		}
		System.out.println();
		
		if(size1 == size2)
		{
			int count = 0;
			for(int i=0;i<size1;i++)
			{
				if(arr1[i] == arr2[i])
				{
					count++;
				}
			}
			if(count == size1)
			{
				System.out.println("Both Arrays are equals.");
			}
			else
			{
				System.out.println("Both Arrays are not equals.");
			}
		}
		else
		{
			System.out.println("Both Arrays are having different size so we can't compare.");
		}
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_14
Enter size of 1st Array : 5
Enter elements of 1st Array : 1 2 3 4 5

Enter size of  2nd Array : 5
Enter elements of  2nd Array : 1 2 3 4 5

Both Arrays are equals.

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_14
Enter size of 1st Array : 5
Enter elements of 1st Array : 1 2 3 4 5

Enter size of  2nd Array : 5
Enter elements of  2nd Array : 5 4 3 2 1

Both Arrays are not equals.

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_14
Enter size of 1st Array : 5
Enter elements of 1st Array : 1 2 3 4 5

Enter size of  2nd Array : 3
Enter elements of  2nd Array : 1 2 3

Both Arrays are having different size so we can't compare.
*/