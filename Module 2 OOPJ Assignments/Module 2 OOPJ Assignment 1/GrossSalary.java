//Q.8.	In a company an employee is paid as under: 
//		If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. 
//		If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. 
//		If the employee's salary is input by the user write a program to find his gross salary. 
//		[ formula : GS= basic + DA + HRA ]

import java.util.*;

class GrossSalary
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter basic Salary of Employee: ");
		float basic = sc.nextFloat();
		float DA=0.0f,GS=0.0f,HRA=0.0f;
		
		if(basic<10000.0)
		{
			HRA=((float)10/100)*basic;
			DA=((float)90/100)*basic;
		}
		else if(basic>=10000.0)
		{
			HRA=2000.0f;
			DA=((float)98/100)*basic;
		}
		
		GS=basic+HRA+DA;
		System.out.println("Basic Salary of Employee is "+basic);
		System.out.println("HRA of Employee is "+HRA);
		System.out.println("DA of Employee is "+DA);
		System.out.println("Gross Salary of Employee is "+GS);
	}
}


/*
Enter basic Salary of Employee: 12000
Basic Salary of Employee is 12000.0
HRA of Employee is 2000.0
DA of Employee is 11760.0
Gross Salary of Employee is 25760.0

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 1>java GrossSalary
Enter basic Salary of Employee: 5000
Basic Salary of Employee is 5000.0
HRA of Employee is 500.0
DA of Employee is 4500.0
Gross Salary of Employee is 10000.0
*/