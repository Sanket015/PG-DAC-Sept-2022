import java.util.Scanner;

//22. Write a Java Program to print Prime Numbers from 1 to N.  

public class Q22 
{
    public static void primeSeries(int num) 
    {
        for(int i=2;i<=num;i++)    
        {
            if(i == 2 || i == 3)
            {
                System.out.print(i+" ");
            }
            else
            {
                int flag = 0;
				for(int j=2;j<=i/2;j++)
				{
					if(i%j == 0)
					{
						flag = 1;
						break;
					}
				}
				if(flag == 0)
				{
					System.out.print(i+" ");
				}
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(num > 0)
        {
            System.out.println("Prime numbers are ");
            primeSeries(num);
        }
        else
            System.out.println("Invalid Input");
    }
}
