//Q.19. Write a program to sum all the values of a given Array in java?
import java.util.*;
class Q_19
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
		System.out.println();
			
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of all elements of Array is : "+sum);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_19
Enter size of Array : 5
Enter elements of Array : 1 2 3 4 5

Sum of all elements of Array is : 15
*/