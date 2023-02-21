import java.util.Scanner;

//23. Write a Java Program to check whether the given number is Armstrong Numberor NOT.

public class Q23 
{
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp=num;
		int count=0,mul=1,sum=0;
		
		while(temp>0)          
		{
		    temp=temp/10;
			count++;
			
		}
		System.out.println("Number of digits are "+count);
		
		temp=num;  		//153
		while(temp>0)   //153     15    1
		{
			mul=temp%10;    //3    5    1
			temp=temp/10;   //15   1    0
			int pro=1;
			for(int i=1;i<=count;i++)  //1..2..3  
			{
				pro=pro*mul;    //3..9..27   5..25..125   1..1..1
			}
			sum=sum+pro;   //27  27+125=152  152+1=153
		}
		
		if(sum==num)
		{
			System.out.println(num+" is an Armstrong Number ");
		}
		else
		{
			System.out.println(num+" is not an Armstrong Number ");
		}
    }    
}
