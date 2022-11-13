//Q.11. Java Program to Illustrate Use of Methods in a Class
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
	public void display(int sum)
	{
		System.out.println("Addition of "+a+" and "+b+" is "+sum);
	}
}

public class Q_11
{
	public static void main(String[] args)
	{
		Test t = new Test(10,20);
		int sum = t.add();
		t.display(sum);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_11
Addition of 10 and 20 is 30
*/