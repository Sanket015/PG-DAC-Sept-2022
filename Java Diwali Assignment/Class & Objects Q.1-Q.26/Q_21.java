//Q.21. Java Program to Allocate and Initialize Super Class Members using Constructor
class Parent
{
	int id;
	String name;
	
	Parent(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void print()
	{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
	}
}

class Child extends Parent
{
	int salary;
	
	Child(int id,String name,int salary)
	{
		super(id,name);
		this.salary = salary;
	}
	
	public void print()
	{
		super.print();
		System.out.println("Salary : "+salary);
	}
}

public class Q_21
{
	public static void main(String[] args)
	{
		Child c = new Child(1,"Sanket",20000);
		c.print();
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_21
ID : 1
Name : Sanket
Salary : 40000
*/