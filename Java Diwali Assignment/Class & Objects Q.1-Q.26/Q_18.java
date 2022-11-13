//Q.18. Java Program to Illustrates Use of Chaining Constructor
class Test
{
	Test()
	{
		System.out.println("Inside default Constructor");
	}
	Test(int a)
	{
		this();
		System.out.println("Inside Parameterized 1-Argument Constructor");
	}
	Test(int a,int b)
	{
		this(a);
		System.out.println("Inside Parameterized 2-Argument Constructor");
	}
}

public class Q_18
{
	public static void main(String[] args)
	{
		Test t = new Test(10,20);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_18
Inside default Constructor
Inside Parameterized 1-Argument Constructor
Inside Parameterized 2-Argument Constructor
*/