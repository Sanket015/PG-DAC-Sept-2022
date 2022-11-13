//Q.23. How to convert ArrayList to String Array in java ?
import java.util.*;  
public class Q_23 
{  
	public static void main(String[] args)   
	{     
		ArrayList<String> list= new ArrayList<String>();
		System.out.print("Enter ArrayList Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Elements :");
		for(int i=0;i<size;i++)
		{
			String str=sc.nextLine();
			list.add(str);
		}
		
		String arr[] = new String[list.size()];                
		for(int j=0;j<list.size();j++)
		{  
			arr[j]=list.get(j);  
		}  
		System.out.println();
		System.out.println("After converion of arraylist to string array : ");
		for(String k : arr)  
		{  
			System.out.println(k);   
		}  
	}  
} 

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Arrays Q.1-Q.24>java Q_23
Enter ArrayList Size :5
Enter Elements :
hi
hello
33
easy
play

After converion of arraylist to string array :
hi
hello
33
easy
play
*/