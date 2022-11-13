//Q.3. Write a Java program to find all pairs of elements in an integer array whose sum is equal 
//		to a given number?
import java.util.*;
class Q_3
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
		
		System.out.print("Enter a key element : ");
		int key = sc.nextInt();
		
		System.out.println();
		System.out.println("Pairs of elements in an array whose sum is equal to key are : ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i] + arr[j] == key)
				{
					System.out.println(arr[i]+" + "+arr[j]+" = "+key);
				}
			}
		}
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_3
Enter size of Array : 10
Enter elements of Array : 1 2 3 4 5 6 7 8 9 0
Enter a key element : 5

Pairs of elements in an array whose sum is equal to key are :
1 + 4 = 5
2 + 3 = 5
3 + 2 = 5
4 + 1 = 5
5 + 0 = 5
0 + 5 = 5
*/