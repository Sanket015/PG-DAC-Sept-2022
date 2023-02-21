import java.util.Scanner;

//15. Write a java program to Reverse a given number. 

public class Q15 
{
    public static void reverse(int num) 
    {
        int temp = num;
        int rev = 0;
        while(temp > 0)    
        {
            rev = rev*10 + temp%10;
            temp = temp/10;
        }
        System.out.println("The Reverse of "+num+" is "+rev);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        reverse(num);
    }
}
