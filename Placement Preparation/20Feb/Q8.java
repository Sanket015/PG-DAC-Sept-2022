import java.util.Scanner;

//8. Write a Java Program to find whether given number is Leap year or NOT? 

public class Q8 
{
    public static void checkLeap(int num) 
    {
        if(num != 0)
        {
            if( num%4 == 0 )
            {
                if( num%400 == 0 )
                {
                    System.out.println(num+" is a Leap Year");
                }
                else if( num%100 == 0 )
                {
                    System.out.println(num+" is not a Leap Year");
                }
                else
                {
                    System.out.println(num+" is a Leap Year");
                }
            }
            else
            {
                System.out.println(num+" is not a Leap Year");
            }
        }
        else
        {
            System.out.println(num+" is not a Leap Year");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        checkLeap(num);
    }    
}

