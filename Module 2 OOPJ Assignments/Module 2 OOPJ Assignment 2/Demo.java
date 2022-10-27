// class - MathOperation, Demo
// methods - add(),subtract(),multiply(),power()

import java.util.*;

class MathOperation
{
	double num1,num2,num3,mum4,num5,num6,num7,num8;
	
	MathOperation()
	{}
	double add(double num1, double num2)
	{
		double add = num1+num2;
		return add;
	}
	double subtract(double num3, double num4)
	{
		double sub = num3-num4;
		return sub;
	}
	double multiply(double num5, double num6)
	{
		double mul = num5*num6;
		return mul;
	}
	double power(double num7, double num8)
	{
		double pow = 1;
		if(num8 == 0)
		{
			pow = 1;
		}
		else
		{
			for(int i=1; i<=num8; i++)
			{
				pow = pow*num7;
			}
		}
		return pow;
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		MathOperation m = new MathOperation();
		System.out.println("Addition of 2 Numbers:");
		System.out.print("Enter 1st Number:");
		double num1 = sc.nextDouble();
		System.out.print("Enter 2nd Number:");
		double num2 = sc.nextDouble();
		double add = m.add(num1,num2);
		System.out.println("Addition of "+num1+" and "+num2+" is: "+add);
		System.out.println();
		
		
		System.out.println("Subtraction of 2 Numbers:");
		System.out.print("Enter 1st Number:");
		double num3 = sc.nextDouble();
		System.out.print("Enter 2nd Number:");
		double num4 = sc.nextDouble();
		double sub = m.subtract(num3,num4);
		System.out.println("Subtraction of "+num3+" and "+num4+" is: "+sub);
		System.out.println();

		
		System.out.println("Multiplication of 2 Numbers:");
		System.out.print("Enter 1st Number:");
		double num5 = sc.nextDouble();
		System.out.print("Enter 2nd Number:");
		double num6 = sc.nextDouble();
		double mul = m.multiply(num5,num6);
		System.out.println("Multiplication of "+num5+" and "+num6+" is: "+mul);
		System.out.println();
		
		
		System.out.println("Power of a Number:");
		System.out.print("Enter a Number:");
		double num7 = sc.nextDouble();
		System.out.print("Enter Power of a Number:");
		int num8 = sc.nextInt();
		double pow = m.power(num7,num8);
		System.out.println(num7+" is to "+num8+" is: "+pow);
	}
	
}


/*
Output: 

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignment 2>java Demo
Addition of 2 Numbers:
Enter 1st Number:22
Enter 2nd Number:33
Addition of 22.0 and 33.0 is: 55.0

Subtraction of 2 Numbers:
Enter 1st Number:44
Enter 2nd Number:55
Subtraction of 44.0 and 55.0 is: -11.0

Multiplication of 2 Numbers:
Enter 1st Number:11
Enter 2nd Number:99
Multiplication of 11.0 and 99.0 is: 1089.0

Power of a Number:
Enter a Number:5
Enter Power of a Number:3
5.0 is to 3 is: 125.0
*/