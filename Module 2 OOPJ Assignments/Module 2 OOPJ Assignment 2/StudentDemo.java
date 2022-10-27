// class - Student
// members - name,3 subjects marks
// methods - totalAvg(), displayDetails()


class Student
{
	String name;
	double marks1, marks2, marks3,avg;
	
	Student()
	{}
	Student(String name, int marks1, int marks2, int marks3)
	{
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	void totalAvg()
	{
		avg = (marks1+marks2+marks3)/3;
	}
	void displayDetails()
	{
		System.out.println("Name of the Student is: "+name);
		System.out.println("Average of Total marks is: "+avg);
	}
}

class StudentDemo
{
	public static void main(String[] args)
	{
		Student s = new Student("Sanket",60,89,77);
		s.totalAvg();
		s.displayDetails();
	}
}

/*
Output:

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignment 2>java StudentDemo
Name of the Student is: Sanket
Average of Total marks is: 75.33333333333333
*/