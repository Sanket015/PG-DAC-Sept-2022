//Q.19

import java.util.Scanner;

class EvenSeries
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number of terms:");
	int terms = sc.nextInt();
	int num = 2;
    if(terms<=0)
	{
		System.out.println("Enter Positive Number of terms and try again...");
	}
	else
	{
		for(int i=1;i<=terms;i++)
		{
			System.out.print(num+" ");
			num=num+2;
		}
	}
		
  }
}

/*
Enter the Number of terms:10
2 4 6 8 10 12 14 16 18 20
------------------------------------------------------------
Enter the Number of terms:20
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40
*/