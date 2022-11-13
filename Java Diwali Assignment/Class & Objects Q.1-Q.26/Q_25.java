//Q.25. Java Program to Check Whether Which One is Executed First, Static Block or the Static Method.
class Q_25
{
	static
	{
		System.out.println("Static block executed.");
	}
	public static void display()
	{
		System.out.println("Static method executed.");
	}
	public static void main(String[] args)
	{
		display();
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_25
Static block executed.
Static method executed.
*/