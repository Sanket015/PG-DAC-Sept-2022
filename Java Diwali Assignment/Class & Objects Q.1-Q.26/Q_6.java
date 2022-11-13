//Q.6. Java Program to Create Outer Class Bank Account and the Inner Class Interest in it
class Bank
{
    int p,rate,n;
    Bank(int p,int rate,int n)
	{
		this.p = p;
		this.rate = rate;
		this.n = n;
	}
	
    void interest()
	{
        Interest in = new Interest();
        in.display();
    }
	
    class Interest 
    {
        void display() 
        {
            int interest = (p*rate*n)/100;
            System.out.println("Interest for RS."+p+" with "+rate+"% rate for "+n+" years = Rs. " +interest);
        }
    }
}

public class Q_6 
{
    public static void main(String args[]) 
    {
        Bank b = new Bank(10000,6,5);
        b.interest();
    }
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_6
Interest for RS.10000 with 6% rate for 5 years = Rs. 3000
*/