//Q.8. Write a program which takes an array of integers and prints the running average of 3 
//		consecutive integers. 
//		In case the array has fewer than 3 integers, there should be no output.
//		Input: [5,14,35,89,140]
//		Output: [18, 46, 88] 
import java.util.*;
class Q_8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array : ");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		System.out.print("Enter elements of Array : ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		int[] arr2 = new int[arr1.length-2];
		for(int i=0;i<arr1.length-2;i++)
		{
			arr2[i] = (arr1[i]+arr1[i+1]+arr1[i+2])/3;
		}
		System.out.print("New array is : ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_8
Enter size of Array : 5
Enter elements of Array : 5 14 35 89 140
New array is : 18 46 88
*/