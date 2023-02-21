import java.util.Scanner;

//1. Check the given number is EVEN or ODD. 

class Q1
{
    public static void checkEven(int num) 
    {
        if(num%2 == 0)
        {
            System.out.println(num+" is Even number");
        }
        else
        {
            System.out.println(num+" is Odd number");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        checkEven(num);
    }
}

/* 
Enter a number : 10
10 is Even number
PS C:\Users\Sanket\OneDrive\Desktop\Codes Practice\20Feb> java Q1
Enter a number : 223
223 is Odd number
*/