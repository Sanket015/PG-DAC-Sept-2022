import java.util.*;
class Q_1
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
		System.out.println("Entered Array elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"] = "+arr[i]);
		}
	}
}

/*
Output:
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>javac Q_1.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_1
Enter the size of array: 5
Enter array element at index 0 : 1
Enter array element at index 1 : 2
Enter array element at index 2 : 3
Enter array element at index 3 : 4
Enter array element at index 4 : 5

Entered Array elements are:
arr[0] = 1
arr[1] = 2
arr[2] = 3
arr[3] = 4
arr[4] = 5
*/