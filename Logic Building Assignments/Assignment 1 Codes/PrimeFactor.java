//Q.18

import java.util.Scanner;

class PrimeFactor
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number:");
	int num = sc.nextInt();

    for(int i=2;i<num;i++)
	{
		while(num%i==0)
		{
			System.out.println(i+" ");
			num=num/i;
		}
	}
	if(num>2)
	{
		System.out.println(num);
	}
  }
}

/*
Enter a Number:5
5
---------------------------------------------
Enter a Number:10
2
5
---------------------------------------------
Enter a Number:55
5
11
---------------------------------------------
Enter a Number:100
2
2
5
5
*/