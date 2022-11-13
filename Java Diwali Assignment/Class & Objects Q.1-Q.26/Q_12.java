//Q.12. Java Program to Create a Method without Parameters and with Return Type
class Test
{
	int a,b;
	Test(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	public int add()
	{
		return (a+b);
	}
}

public class Q_12
{
	public static void main(String[] args)
	{
		Test t = new Test(10,20);
		System.out.println("Addition of "+t.a+" and "+t.b+" is "+t.add());
	}
}


/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_12
Addition of 10 and 20 is 30
*/