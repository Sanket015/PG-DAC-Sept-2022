//Q.9. Java Program to Implement the Passing and Returning Objects
import java.util.*;
class First
{
	int a;
	First(int a)
	{
		this.a = a;
	}
}

class Second
{
	int b;
	Second(int b)
	{
		this.b = b;
	}
}

class Addition
{
	int sum;
	Addition(First f,Second s)
	{
		sum = f.a + s.b;
	}
	void show()
	{
		System.out.println("Sum = "+sum);
	}
	
	
}
public class Q_9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number = ");
		int num1 = sc.nextInt();
		First f = new First(num1);
		System.out.print("Enter Second Number = ");
		int num2 = sc.nextInt();
		Second s = new Second(num2);
		Addition a = new Addition(f,s);
		a.show();
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_9
Enter First Number = 10
Enter Second Number = 20
Sum = 30
*/