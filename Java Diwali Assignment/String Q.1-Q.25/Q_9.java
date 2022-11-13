//Q.9. How to convert numeric String to an int?
import java.util.*;
class Q_9
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Numeric String : ");
		String str = sc.nextLine();
		int num = Integer.parseInt(str);
		System.out.println("Converting "+str+" numeric String to an int "+num);
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_9
Enter Numeric String : 1111
Converting 1111 numeric String to an int 1111

C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\String Q.1-Q.25>java Q_9
Enter Numeric String : 1234
Converting 1234 numeric String to an int 1234
*/