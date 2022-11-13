//Q.13. Java Program to Create a Method without Parameters and Return Type
class Test
{
	int a,b;
	Test(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	public void add()
	{
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
	}
}

public class Q_13
{
	public static void main(String[] args)
	{
		Test t = new Test(10,20);
		t.add();
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_13
Addition of 10 and 20 is 30
*/