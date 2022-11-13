//Q.10. Java Program to Swap Objects using Swap() Method
import java.util.*;

class SwapObject
{
	int num;
	
	public void swap(SwapObject s1,SwapObject s2)
	{
		int temp;
		
		temp = s1.num;
		s1.num = s2.num;
		s2.num = temp;
	}
}

class Q_10
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		SwapObject s1 = new SwapObject();
		SwapObject s2 = new SwapObject();
		System.out.print("Enter value of number for first objet :");
		s1.num = sc.nextInt();
		System.out.print("Enter value of number for second objet :");
		s2.num = sc.nextInt();
		
		System.out.println("===========Before Swapping=============");
		System.out.println("Value of object 1 number :"+s1.num);
		System.out.println("Value of object 2 number :"+s2.num);
		s1.swap(s1,s2);
		System.out.println("===========After Swapping=============");
		System.out.println("Value of object 1 number :"+s1.num);
		System.out.println("Value of object 2 number :"+s2.num);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_10
Enter value of number for first objet :10
Enter value of number for second objet :20
===========Before Swapping=============
Value of object 1 number :10
Value of object 2 number :20
===========After Swapping=============
Value of object 1 number :20
Value of object 2 number :10
*/