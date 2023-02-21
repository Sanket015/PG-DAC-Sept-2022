import java.util.Scanner;

//10. Write a Java Program to print the digits of a Given Number. 

public class Q10 
{
    public static int count(int num)
    {
        int temp = num;
        int count = 0;
        while(temp > 0)
        {
            temp = temp / 10;
            count++;
        }
        return count;
    }
    public static void digits(int num) 
    {
        int count = count(num);
        int temp = num;
        int dig;
        int[] digits = new int[count];
        for(int i=0;i<count && temp>0;i++)
        {
            dig = temp % 10;
            temp = temp / 10;
            digits[i] = dig;
        }
        System.out.print("Digits are ");
        for(int i=count-1;i>=0;i--)
        {
            System.out.print(digits[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        digits(num);
    }    
}

