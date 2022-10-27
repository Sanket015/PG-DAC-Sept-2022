// Complex Number:
// methods: add(),multoply()
import java.util.*;
class ComplexNum
{
	double real;
	double img;
	
	ComplexNum()
	{
		real = 0;
		img = 0;
	}
	ComplexNum(double img)
	{
		this();
		this.real = real;
	}
	ComplexNum(double real,double img)
	{
		this.real = real;
		this.img = img;
	}
	double add(double num1,double num2)
	{
		double add = (num1+num2);
		return add;
	}
	double realMultiply(double a,double b,double c,double d)
	{
		double r = (a*c)-(b*d);
		return r;
	}
	double imgMultiply(double a,double b,double c,double d)
	{
		double i = (b*c)+(a*d);
		return i;
	}
	String print(double real,double img)
	{
		return real+" + "+img+" i ";
	}
	
}

class ComplexNumDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ComplexNum c = new ComplexNum();
		
		System.out.println("1st Complex Number: ");
		System.out.print("Enter the Real part's value: ");
		double r1 = sc.nextDouble();
		System.out.print("Enter the Imaginary part's value : ");
		double i1 = sc.nextDouble();
		System.out.println();
		
		System.out.println("2nd Complex Number: ");
		System.out.print("Enter the Real part's value: ");
		double r2 = sc.nextDouble();
		System.out.print("Enter the Imaginary part's value : ");
		double i2 = sc.nextDouble();
		System.out.println();
		
		double realAdd = c.add(r1,r2);
		double imgAdd = c.add(i1,i2);
		System.out.println("Addition of Complex Number is: "+c.print(realAdd,imgAdd));
		
		double rmul = c.realMultiply(r1,i1,r2,i2);
		double imul = c.imgMultiply(r1,i1,r2,i2);
		System.out.println("Multiplication of Complex Number is: "+c.print(rmul,imul));
		
	}
}

/*
Output:

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 2>java ComplexNumDemo
1st Complex Number:
Enter the Real part's value: 3
Enter the Imaginary part's value : 2
2nd Complex Number:
Enter the Real part's value: 4
Enter the Imaginary part's value : -2
Addition of Complex Number is: 7.0 + 0.0 i

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 2>javac ComplexNumDemo.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 2>java ComplexNumDemo
1st Complex Number:
Enter the Real part's value: 3
Enter the Imaginary part's value : 2

2nd Complex Number:
Enter the Real part's value: 4
Enter the Imaginary part's value : -2

Addition of Complex Number is: 7.0 + 0.0 i
Multiplication of Complex Number is: 16.0 + 2.0 i
*/