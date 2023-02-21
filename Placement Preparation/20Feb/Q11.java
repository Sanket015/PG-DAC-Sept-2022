import java.util.Scanner;

//11. Write a Java Program to print all the Factors of the Given number.

public class Q11 
{
    public static void factors(int num) 
    {
        System.out.println("Factors of "+num+" are ");
        for(int i=1;i<=num;i++)    
        {
            if(num%i == 0)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        factors(num);
    }
}
