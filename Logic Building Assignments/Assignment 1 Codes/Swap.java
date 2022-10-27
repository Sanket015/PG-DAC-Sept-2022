//Q.4

import java.util.Scanner;

class Swap
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a 1st Number:");
	int a = sc.nextInt();
	System.out.print("Enter a 2nd Number:");
	int b = sc.nextInt();
	
    a = a+b;
    b = a-b;
    a = a-b;
    
    System.out.println("After Swapping Numbers:"); 	
	System.out.println("1st Number a = "+a); 
    System.out.println("2nd Number b = "+b); 	
  }
}

/*
Enter a 1st Number:9
Enter a 2nd Number:15
After Swapping Numbers:
1st Number a = 15
2nd Number b = 9
---------------------------------------
Enter a 1st Number:-5
Enter a 2nd Number:10
After Swapping Numbers:
1st Number a = 10
2nd Number b = -5
---------------------------------------
Enter a 1st Number:-9
Enter a 2nd Number:-22
After Swapping Numbers:
1st Number a = -22
2nd Number b = -9
*/