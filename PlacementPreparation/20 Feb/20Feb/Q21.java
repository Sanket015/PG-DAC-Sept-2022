import java.util.Scanner;

//21. Write a Java Program to check whether the Given Number is Prime Number or NOT. 

public class Q21 
{
    public static void prime(int num) 
    {
        int flag = 0;
        for(int i=2;i<=num/2;i++)    
        {
            if(num == 2 || num == 3)
            {
                flag = 0;
                break;
            }
            if(num%i == 0)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println(num+" is not a Prime number");
        }
        else
        {
            System.out.println(num+" is a Prime number");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(num > 0)
            prime(num);
        else
            System.out.println(num+" is not a Positive number");
    }
}
