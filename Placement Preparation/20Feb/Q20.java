import java.util.Scanner;

//20. Write a Java Program to print all the Prime Factors of the Given Number. 

public class Q20 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        for(int i=2;i<num;i++)
        {
            while(num%i == 0)
            {
                System.out.println(i+" ");
                num = num/i;
            }
        }
        if(num > 2)
        {
            System.out.println(num);
        }
    }    
}
