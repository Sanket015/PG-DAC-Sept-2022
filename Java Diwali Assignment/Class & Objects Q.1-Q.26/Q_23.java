//Q.23. Java Program to Demonstrate Usage of an Instance Variable in the Test Class
class Test
{
	int a=10;
	static int b=10;
	Test()
	{
		b++;
	}
}

class Q_23
{
	public static void main(String[] args)
	{
		Test t1 = new Test();
		System.out.println("Instance variable = "+t1.a);
		System.out.println("Static variable = "+t1.b);
		
		Test t2 = new Test();
		System.out.println("Instance variable = "+t2.a);
		System.out.println("Static variable = "+t2.b);
		
		Test t3 = new Test();
		System.out.println("Instance variable = "+t3.a);
		System.out.println("Static variable = "+t3.b);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_23
Instance variable = 10
Static variable = 11
Instance variable = 10
Static variable = 12
Instance variable = 10
Static variable = 13
*/