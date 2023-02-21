import java.util.Scanner;

//7. How to check the given number is Positive or Negativein Java?

public class Q7 
{
    public static void checkNumber(int num1) 
    {
        if(num1 != 0)
        {
            String res = num1 > 0 ? num1+" is a Positive Number" : num1+" is a Negative Number";
            System.out.println(res);
        }
        else
        {
            System.out.println(num1+" is Zero");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();

        checkNumber(num1);
    }    
}

