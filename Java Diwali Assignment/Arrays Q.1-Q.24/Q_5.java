import java.util.*;
class Q_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter array element at index "+i+" : ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("The Smallest number in given array is : "+arr[0]);
		System.out.println("The Largest number in given array is : "+arr[arr.length-1]);
	}
}

/*
Output:
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>javac Q_5.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_5
Enter the size of array: 3
Enter array element at index 0 : 3
Enter array element at index 1 : 9
Enter array element at index 2 : 1

The Smallest number in given array is : 1
The Largest number in given array is : 9

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_5
Enter the size of array: 7
Enter array element at index 0 : 1
Enter array element at index 1 : 4
Enter array element at index 2 : 2
Enter array element at index 3 : 6
Enter array element at index 4 : 3
Enter array element at index 5 : 7
Enter array element at index 6 : 8

The Smallest number in given array is : 1
The Largest number in given array is : 8
*/