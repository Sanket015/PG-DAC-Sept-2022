//Q.26. Java Program to Calculate Sum of Two Byte Values using Type Casting
import java.util.*;
class Q_26
{
	public static byte byteAdd(byte a,byte b)
	{
		return (byte)(a+b);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 1st number : ");
		byte a = sc.nextByte();
		System.out.print("Enter a 2nd number : ");
		byte b = sc.nextByte();
		System.out.println("Addition of 2 byte values i.e. "+a+" + "+b+" = "+byteAdd(a,b));
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_26
Enter a 1st number : 10
Enter a 2nd number : 22
Addition of 2 byte values i.e. 10 + 22 = 32
*/