//Q.15. Java Program to Illustrate the Use of HashCode() Method
public class Q_15 
{
	public static void main(String args[]) 
	{
		String a = "Hi";
		String b = "Hi";
		  
		
		System.out.println("HashCode of a = "+a+" : "+a.hashCode());
		System.out.println("HashCode of b = "+b+" : "+b.hashCode());

		if(a.equals(b))
		{
			System.out.println("a & b hashcode is same ");
		}

		String c = "hi";
		
		if(a.equals(c))
		{
			System.out.println("a & c hashcode is same ");
		}
		else
		{		
			System.out.println("a & c hashcode is Different ");
		}
		
		System.out.println("HashCode of c = "+c+" : "+c.hashCode());

		System.out.println("HashCode of a = "+a+" : "+a.hashCode());
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_15
HashCode of a = Hi : 2337
HashCode of b = Hi : 2337
a & b hashcode is same
a & c hashcode is Different
HashCode of c = hi : 3329
HashCode of a = Hi : 2337
*/