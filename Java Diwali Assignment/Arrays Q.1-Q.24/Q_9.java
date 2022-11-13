//Q.9. Write a program which generates the series 1,4,27,16,125,36
import java.util.*;
class Q_9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int term = sc.nextInt();
		
		for(int i=1;i<=term;i++)
		{
			if(i%2 == 0)
			{
				System.out.print(i*i+" ");
			}
			else
			{
				System.out.print(i*i*i+" ");
			}
		}
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_9
Enter number of terms : 6
1 4 27 16 125 36
*/