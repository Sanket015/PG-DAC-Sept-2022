//Q.16. Java Program to Illustrate Use of Final Keyword
class FinalBank
{
	final String welcome = "Welcome to Banking Sector";
	FinalBank()
	{
		System.out.println(welcome);
	}

}

class Banks extends FinalBank
{
	Banks(String bank)
	{
		System.out.println("This is "+bank+" bank");
	}
}

final class Branch extends Banks
{
	Branch(String bank,String br)
	{
		super(bank);
		System.out.println("This is "+br+" branch");
	}
}

public class Q_16
{
	public static void main(String[] args)
	{
		Branch b1 = new Branch("Axis","Mumbai");
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_16
Welcome to Banking Sector
This is Axis bank
This is Mumbai branch
*/