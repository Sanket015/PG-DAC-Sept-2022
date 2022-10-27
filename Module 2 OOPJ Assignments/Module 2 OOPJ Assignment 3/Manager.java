// class - Account{SavingAccount,CurrentAccount},Manager
// Account - data{accountNumber, holderName, balance}
// SavingAccount - data{interestRate}, method{calculateYearlyInterest}

import java.util.*;
abstract class Account
{
	String accountNumber;
	String holderName;
	double balance;
	
	Account()
	{}
	Account(String accountNumber,String holderName,double balance)
	{
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	abstract void printDetails();
}

class SavingAccount extends Account
{
	double interestRate = 3.0;
	double yearlyInterest;
	
	SavingAccount()
	{}
	SavingAccount(String accountNumber,String holderName,double balance)
	{
		super(accountNumber,holderName,balance);
		calculateYearlyInterest();
	}
	
	void calculateYearlyInterest()
	{
		yearlyInterest = (balance*interestRate)/100;
	}
	
	public void printDetails()
	{
		System.out.println("Saving Account Details:");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder's Name: "+holderName);
		System.out.println("Account Balance: Rs."+balance);
		System.out.println("Interest Rate: "+interestRate+" %");
		System.out.println("Yearly Interest: Rs."+yearlyInterest);
		System.out.println("------------------------------------");
	}
}

class CurrentAccount extends Account
{
	CurrentAccount()
	{}
	CurrentAccount(String accountNumber,String holderName,double balance)
	{
		super(accountNumber,holderName,balance);
	}
	public void printDetails()
	{
		System.out.println("Current Account Details:");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder's Name: "+holderName);
		System.out.println("Account Balance: Rs."+balance);
		System.out.println("------------------------------------");
	}
}

public class Manager
{
	public static void main(String[] args)
	{
		List<SavingAccount> sList = new ArrayList<>();
		List<CurrentAccount> cList = new ArrayList<>();
		
		sList.add(new SavingAccount("S0000001","Sanket Raut",1000));
		sList.add(new SavingAccount("S0000002","Darshan Raut",2000));
		savingDisplay(sList);
		System.out.println("------------------------------------");
		
		cList.add(new CurrentAccount("C0000001","Sanket Raut",10000));
		cList.add(new CurrentAccount("C0000002","Darshan Raut",20000));
		cList.add(new CurrentAccount("C0000003","Adarsh Raut",30000));
		currentDisplay(cList);
	}
	
	public static void savingDisplay(List<SavingAccount> slist)
	{
		Iterator<SavingAccount> it = slist.iterator();
		int num1 = 1;
		while(it.hasNext())
		{
			SavingAccount sa = it.next();
			System.out.println("Saving Account "+num1);
			sa.printDetails();
			num1++;
		}
	}
	
	public static void currentDisplay(List<CurrentAccount> clist)
	{
		Iterator<CurrentAccount> it = clist.iterator();
		int num2 = 1;
		while(it.hasNext())
		{
			CurrentAccount ca = it.next();
			System.out.println("Current Account "+num2);
			ca.printDetails();
			num2++;
		}
	}
}



/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 3>java Manager
Saving Account 1
Saving Account Details:
Account Number: S0000001
Account Holder's Name: Sanket Raut
Account Balance: Rs.1000.0
Interest Rate: 3.0 %
Yearly Interest: Rs.30.0
------------------------------------
Saving Account 2
Saving Account Details:
Account Number: S0000002
Account Holder's Name: Darshan Raut
Account Balance: Rs.2000.0
Interest Rate: 3.0 %
Yearly Interest: Rs.60.0
------------------------------------
Current Account 1
Current Account Details:
Account Number: C0000001
Account Holder's Name: Sanket Raut
Account Balance: Rs.10000.0
------------------------------------
Current Account 2
Current Account Details:
Account Number: C0000002
Account Holder's Name: Darshan Raut
Account Balance: Rs.20000.0
------------------------------------
Current Account 3
Current Account Details:
Account Number: C0000003
Account Holder's Name: Adarsh Raut
Account Balance: Rs.30000.0
------------------------------------

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 3>javac Manager.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 3>java Manager
Saving Account 1
Saving Account Details:
Account Number: S0000001
Account Holder's Name: Sanket Raut
Account Balance: Rs.1000.0
Interest Rate: 3.0 %
Yearly Interest: Rs.30.0
------------------------------------
Saving Account 2
Saving Account Details:
Account Number: S0000002
Account Holder's Name: Darshan Raut
Account Balance: Rs.2000.0
Interest Rate: 3.0 %
Yearly Interest: Rs.60.0
------------------------------------
------------------------------------
Current Account 1
Current Account Details:
Account Number: C0000001
Account Holder's Name: Sanket Raut
Account Balance: Rs.10000.0
------------------------------------
Current Account 2
Current Account Details:
Account Number: C0000002
Account Holder's Name: Darshan Raut
Account Balance: Rs.20000.0
------------------------------------
Current Account 3
Current Account Details:
Account Number: C0000003
Account Holder's Name: Adarsh Raut
Account Balance: Rs.30000.0
------------------------------------
*/