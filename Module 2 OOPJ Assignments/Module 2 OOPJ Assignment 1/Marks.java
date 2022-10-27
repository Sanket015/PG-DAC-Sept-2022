//Q.3.	Write a program to calculate sum of 5 subject’s marks & find percentage. 
//		Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ]. 
//		Use concatenation operator here.


import java.util.*;

class Marks
{
	static int total=0;
	float percentage=0.0f;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Maximum Marks of a subject: ");
		int max=sc.nextInt();
		int[] a = new int[5];
		Marks m = new Marks();
		
		for(int i=0;i<5;i++)
		{
			System.out.print(" Enter Subject "+(i+1)+" Marks out of 100: ");
			a[i] = sc.nextInt();
			m.totalMarks(a[i]);
		}
		
		System.out.println(" Sum of 5 subject's marks is: "+total);
		m.percentage(total,max);
	}
	
	void totalMarks(int a)
	{
		total=total+a;
	}
	
	void percentage(int sum,int max1)
	{
		percentage=((float)(sum*100)/(max1*5));
		System.out.println(" percentage marks = "+percentage+"% ");
	}
}


/*
 Enter Maximum Marks of a subject: 100
 Enter Subject 1 Marks out of 100: 99
 Enter Subject 2 Marks out of 100: 87
 Enter Subject 3 Marks out of 100: 76
 Enter Subject 4 Marks out of 100: 98
 Enter Subject 5 Marks out of 100: 77
 Sum of 5 subject's marks is: 437
 percentage marks = 87.4%
 */
