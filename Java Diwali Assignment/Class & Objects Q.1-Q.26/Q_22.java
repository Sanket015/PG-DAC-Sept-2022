//Q.22. Java Program to Check the Accessibility of Static and Non-Static Variable by a Static Method
class Test
{
	static int a=10;
	int b=20;
	
	public static void staticGet()
	{
		a++;
		System.out.println("Inside static method. Static variable a = "+a);	
	}
	
	public void nonStaticGet()
	{
		b++;
		System.out.println("Inside non-static method. Instance variable b = "+b);
	}
}

public class Q_22
{
	public static void main(String[] args)
	{
		Test t = new Test();
		staticGet();
		t.nonStaticGet();
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_22
Inside static method. Static variable a = 11
Inside non-static method. Instance variable b = 21
*/