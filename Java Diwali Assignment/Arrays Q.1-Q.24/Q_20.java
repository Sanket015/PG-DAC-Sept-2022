//Q.20. How do you separate zeros and non-zeros in a given Array in java?
import java.util.*;
class Q_20
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
		
		int[] temp = new int[size];
		int k = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == 0)
			{
				temp[k] = arr[i];
				k++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != 0)
			{
				temp[k] = arr[i];
				k++;
			}
		}
		System.out.print("Arrays after separating zeros and non-zeros elements is : ");
		for(int i=0;i<k;i++)
		{
			System.out.print(temp[i]+" ");
		}
		System.out.println();
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_20
Enter size of Array : 5
Enter elements of Array : 0 4 3 0 3
Arrays after separating zeros and non-zeros elements is : 0 0 4 3 3

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_20
Enter size of Array : 10
Enter elements of Array : 0 3 2 4 -3 5 0 -9 0 88
Arrays after separating zeros and non-zeros elements is : 0 0 0 3 2 4 -3 5 -9 88
*/