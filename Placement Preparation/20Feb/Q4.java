import java.util.Scanner;

//4. Swap two numberswithout using third variable approach 1. 

public class Q4 
{
    public static void swap(int num1,int num2) 
    {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("1st no. after Swaping is "+num1);
        System.out.println("2nd no. after Swaping is "+num2);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();

        swap(num1,num2);
    }    
}
