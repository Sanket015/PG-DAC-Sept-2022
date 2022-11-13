//Q.24. Java Program to Demonstrate Usage of a Static Variable in the Test Class
class Test
{
	static int count=0;
	Test()
	{
		count++;
		System.out.println("Test Object Created.");
	}
	
	static void count()
	{
		System.out.println("Total "+count+" Test Object Created.");
	}
}

public class Q_24
{
	public static void main(String[] args)
	{
		Test o1=new Test();
		Test o2=new Test();
		Test o3=new Test();
		Test.count();
		Test o4=new Test();
		Test o5=new Test();
		Test.count();
	}	
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_24
Test Object Created.
Test Object Created.
Test Object Created.
Total 3 Test Object Created.
Test Object Created.
Test Object Created.
Total 5 Test Object Created.
*/