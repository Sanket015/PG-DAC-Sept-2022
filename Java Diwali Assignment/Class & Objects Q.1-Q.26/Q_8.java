//Q.8. Java Program to Count Number of Objects Created for Class
class Test
{
	int a;
	static int count;
	
	Test()
	{
		count++;
	}
	Test(int a)
	{
		this.a = a;
		count++;
	}
	public static void countObj()
	{
		System.out.println("Number of Objects Created are "+count);
	}
}

public class Q_8
{
	public static void main(String[] args)
	{
		Test t1 = new Test();
		Test t2 = new Test(10);
		Test.countObj();
		Test t3 = new Test();
		Test t4 = new Test(20);
		Test t5 = new Test();
		Test.countObj();
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_8
Number of Objects Created are 2
Number of Objects Created are 5
*/