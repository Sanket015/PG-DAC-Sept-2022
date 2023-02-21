import java.util.Scanner;

public class Q13 
{
    public static void smallest(int a,int b,int c) 
    {
        int x = 0;
        if((b/a) != 1)  //if(b<a)
        {
            x = ((b/c) != 1) ? b : c;
        }
        else
        {
            x = ((a/c) != 1) ? a : c;
        }
        System.out.println("The Smallest number is "+x);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int c = sc.nextInt();

        smallest(a,b,c);
    }
}
