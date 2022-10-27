//Q.20

import java.util.Scanner;

class OddSeries
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number of terms:");
	int terms = sc.nextInt();
	int num = 1;
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
Enter the Number of terms:5
1 3 5 7 9
-----------------------------------
Enter the Number of terms:10
1 3 5 7 9 11 13 15 17 19
*/