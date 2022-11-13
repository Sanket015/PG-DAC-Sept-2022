//Q.11. How to convert a byte array to String?
import java.util.*;
class Q_11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		
		byte[] arr = str.getBytes();
		System.out.println("Given Byte Array : "+arr);
		
		String s = new String(arr);
		System.out.println("Given Byte Array to String : "+s);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_11
Enter String : Sanket Raut
Given Byte Array : [B@880ec60
Given Byte Array to String : Sanket Raut
*/