//Q.14. Java Program to Create a Method with 2 Parameters and without Return Type
class Test
{
	public void add(int a,int b)
	{
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
	}
}

public class Q_14
{
	public static void main(String[] args)
	{
		Test t = new Test();
		t.add(10,20);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_14
Addition of 10 and 20 is 30
*/