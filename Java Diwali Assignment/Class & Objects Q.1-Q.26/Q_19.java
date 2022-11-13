//Q.19. Java Program to Create an Object for Class and Assign Value in the Object using Constructor
class Student
{
	int id;
	String name;
	int salary;
	
	Student(int id,String name,int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void print()
	{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
	}
}

public class Q_19
{
	public static void main(String[] args)
	{
		Student s = new Student(1,"Sanket",40000);
		s.print();
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_19
ID : 1
Name : Sanket
Salary : 40000
*/