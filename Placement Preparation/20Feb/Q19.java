import java.util.Scanner;

//19. Check whether the Given Numberis a Palindrome or NOT.

public class Q19 
{
    public static void palindrome(int num) 
    {
        int temp = num;
        int rev = 0;
        while(temp > 0)    
        {
            rev = rev*10 + temp%10;
            temp = temp/10;
        }
        if(num == rev)
        {
            System.out.println(num+" is a Palindrome");
        }
        else
        {
            System.out.println(num+" is not a Palindrome");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        palindrome(num);
    }
}
