//Q.20. Write a Java program to find the numbers less than 7 in a tree set. 
import java.util.*;

class Q_20
{
	public static void main(String[] args) 
	{
		TreeSet <Integer>tree = new TreeSet<>();
		
		tree.add(1);
		tree.add(2);
		tree.add(3);
		tree.add(5);
		tree.add(6);
		tree.add(7);
		tree.add(8);
		tree.add(9);
		tree.add(10);
		 
		Iterator iterator;
		iterator = tree.iterator();
		System.out.println("Tree set data: ");     
		while (iterator.hasNext())
		{
			System.out.println(iterator.next() + " ");
		}
		
		tree = (TreeSet)tree.headSet(7); 
		System.out.println("Tree set data less than 7: ");    
		Iterator it1 = tree.iterator();		
		while (it1.hasNext())
		{
			System.out.println(it1.next() + " ");
		}
	}    
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Collection Q.1-Q.25>java Q_20
Tree set data:
1
2
3
5
6
7
8
9
10
Tree set data less than 7:
1
2
3
5
6
*/