import java.util.Scanner;

//12. Write a Java Program to find sum of the digits of a given number. 

public class Q12 
{
    public static void digitsSum(int num) 
    {
        int temp = num;
        int dig,sum=0;
        while(temp > 0)
        {
            dig = temp % 10;
            sum = sum + dig;
            temp = temp / 10;
        }
        System.out.println("The Sum of Digits is "+sum);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        digitsSum(num);
    }    
}

