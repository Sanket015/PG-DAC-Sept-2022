//Q.12. How to rotate an array left and right by a given number K?
import java.util.*;
class Q_12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int[] temp = new int[size];
		
		System.out.print("Enter elements of Array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("1.Shift Elements to Left. \n2.Shift Elements to Right.");
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
		System.out.print("Enter how many Position you want to Shift : ");
		int key = sc.nextInt();
		if(choice == 1)
		{
			int k = 0;
			for(int i=key;i<arr.length;i++)
			{
				temp[k] = arr[i];
				k++;
			}
			for(int i=0;i<key;i++)
			{
				temp[k] = arr[i];
				k++;
			}
			System.out.print("Array shifted Left by "+key+" is : ");
			for(int i=0;i<arr.length;i++)
			{
				arr[i] = temp[i];
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		else if(choice == 2)
		{
			int k = 0;
			for(int i=arr.length-key;i<arr.length;i++)
			{
				temp[k] = arr[i];
				k++;
			}
			for(int i=0;i<=arr.length-key-1;i++)
			{
				temp[k] = arr[i];
				k++;
			}
			System.out.print("Array shifted Right by "+key+" is : ");
			for(int i=0;i<arr.length;i++)
			{
				arr[i] = temp[i];
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		else
		{
			System.out.println("Your choice is Invalid.. ");
		}
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_12
Enter size of Array : 10
Enter elements of Array : 1 2 3 4 5 6 7 8 9 10

1.Shift Elements to Left.
2.Shift Elements to Right.
Enter your choice : 1
Enter how many Position you want to Shift : 2
Array shifted Left by 2 is : 3 4 5 6 7 8 9 10 1 2

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_12
Enter size of Array : 10
Enter elements of Array : 1 2 3 4 5 6 7 8 9 10

1.Shift Elements to Left.
2.Shift Elements to Right.
Enter your choice : 2
Enter how many Position you want to Shift : 2
Array shifted Right by 2 is : 9 10 1 2 3 4 5 6 7 8
*/