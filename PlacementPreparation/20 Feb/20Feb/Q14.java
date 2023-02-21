import java.util.Scanner;

//14. How to add two numbers without using the arithmetic operators in Java? 

public class Q14 
{
    public static void sum(int num1,int num2)
    {
        int sum = num1;
        if(num2 >= 0)
        {
            for(int i=1;i<=num2;i++)
            {
                sum++;
            }
        }
        else
        {
            for(int i=0;i>num2;i--)
            {
                sum--;
            }
        }
        System.out.println("The Sum of "+num1+" and "+num2+" is "+sum);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();

        sum(num1,num2);
    }  
}
