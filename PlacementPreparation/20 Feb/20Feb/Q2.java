import java.util.Scanner;

//2. Write a Java Program to find the Factorialof given number. 

public class Q2 
{
    public static int factorial(int num)
    {
        int fact = 1;
        for(int i=1;i<=num;i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int fact = factorial(num);
        System.out.println("Factorial of "+num+" is "+fact);
    }    
}
