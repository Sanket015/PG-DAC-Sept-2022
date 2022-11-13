import java.util.*;
class Q_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter array element at index "+i+" : ");
			arr1[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Reversed Array elements are:");
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i] = arr1[(arr1.length-1)-i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("arr["+i+"] = "+arr2[i]);
		}
	}
}

/*
Output:
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>javac Q_4.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_4
Enter the size of array: 3
Enter array element at index 0 : 1
Enter array element at index 1 : 2
Enter array element at index 2 : 3

Reversed Array elements are:
arr[0] = 3
arr[1] = 2
arr[2] = 1

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_4
Enter the size of array: 5
Enter array element at index 0 : 1
Enter array element at index 1 : 3
Enter array element at index 2 : 5
Enter array element at index 3 : 7
Enter array element at index 4 : 9

Reversed Array elements are:
arr[0] = 9
arr[1] = 7
arr[2] = 5
arr[3] = 3
arr[4] = 1
*/