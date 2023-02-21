import java.util.Scanner;

//3. Find the Factorialof a number using Recursion. 

public class Q3 
{
    public static int factorial(int num) 
    {
        if(num == 0)    
        {
            return 1;
        }
        else
        {
            return num*factorial(num-1);
        }
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
