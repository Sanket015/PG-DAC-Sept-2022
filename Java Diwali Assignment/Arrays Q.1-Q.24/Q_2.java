import java.util.*;
class Q_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of First array: ");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		int count=0;
		for(int i=0;i<size1;i++)
		{
			System.out.print("Enter array element at index "+i+" : ");
			arr1[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.print("Enter the size of Second array: ");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		for(int i=0;i<size2;i++)
		{
			System.out.print("Enter array element at index "+i+" : ");
			arr2[i] = sc.nextInt();
		}
		System.out.println();
		
		if(size1==size2)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i] == arr2[i])
				{
					count++;
				}
			}
			if(count == (arr1.length))
			{
				System.out.println("Array 1 and Array 2 are equal");
			}
			else
			{
				System.out.println("Array 1 and Array 2 are not equal");
			}
		}
		else
		{
			System.out.println("Array 1 and Array 2 are not equal");
		}
		System.out.println("---------------------------------------");
	}
}

/*
Output:

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>javac Q_2.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_2
Enter the size of First array: 2
Enter array element at index 0 : 1
Enter array element at index 1 : 2

Enter the size of Second array: 2
Enter array element at index 0 : 1
Enter array element at index 1 : 2

Array 1 and Array 2 are equal
---------------------------------------

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_2
Enter the size of First array: 5
Enter array element at index 0 : 5
Enter array element at index 1 : 4
Enter array element at index 2 : 3
Enter array element at index 3 : 2
Enter array element at index 4 : 1

Enter the size of Second array: 5
Enter array element at index 0 : 5
Enter array element at index 1 : 4
Enter array element at index 2 : 3
Enter array element at index 3 : 2
Enter array element at index 4 : 1

Array 1 and Array 2 are equal
---------------------------------------

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_2
Enter the size of First array: 5
Enter array element at index 0 : 1
Enter array element at index 1 : 3
Enter array element at index 2 : 5
Enter array element at index 3 : 7
Enter array element at index 4 : 9

Enter the size of Second array: 5
Enter array element at index 0 : 2
Enter array element at index 1 : 4
Enter array element at index 2 : 6
Enter array element at index 3 : 8
Enter array element at index 4 : 10

Array 1 and Array 2 are not equal
---------------------------------------

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_2
Enter the size of First array: 2
Enter array element at index 0 : 2
Enter array element at index 1 : 3

Enter the size of Second array: 4
Enter array element at index 0 : 2
Enter array element at index 1 : 3
Enter array element at index 2 : 4
Enter array element at index 3 : 5

Array 1 and Array 2 are not equal
---------------------------------------
*/