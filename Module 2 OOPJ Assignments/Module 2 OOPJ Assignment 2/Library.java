//Book Library:
import java.util.*;
class Book
{
	String title, author, publisher;
	int numOfPages;
	float price;
	
	Book()
	{}
	Book(String title,String author ,String publisher,int numOfPages,float price)
	{
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.numOfPages = numOfPages;
		this.price = price;
	}
	
	void printDetails()
	{
		System.out.println("Title of the Book: "+title);
		System.out.println("Name of an Author of the Book: "+author);
		System.out.println("Name of Publisher of the Book: "+publisher);
		System.out.println("Number of Pages of the Book: "+numOfPages);
		System.out.println("Price of the Book: "+price);
		System.out.println("----------------------------------------------------");
	}
	
}
public class Library
{
	public static void main(String[] args)
	{
		int ch;
		List<Book> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("============ Welcome to Books Library ============");
			System.out.println("1. Add Book. \n2.Delete Book. \n3.Show Books. \n4.Exit");
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();
			sc.nextLine();
			System.out.println("============ Welcome to Books Library ============");
			
			switch(ch)
			{
				case 1:
					System.out.print("Enter the Title of the Book : ");
					String title = sc.nextLine();
					System.out.print("Enter the Name of an Author of the Book : ");
					String author = sc.nextLine();
					System.out.print("Enter the Name of Publisher of the Book : ");
					String publisher = sc.nextLine();
					System.out.print("Enter the Numbers of Pages of the Book : ");
					int numOfPages = sc.nextInt();
					System.out.print("Enter the Price of the Book : ");
					float price = sc.nextFloat();
					list.add(new Book(title,author,publisher,numOfPages,price));
					System.out.print("Book added Successfully...");
					break;
				
				case 2:
					System.out.print("Enter Number of Book you want to Delete:");
					int n = sc.nextInt();
					Book b = list.remove(n-1);
					System.out.println("Book Deleted Successfully...");
					break;
				
				case 3:
					System.out.println("Library Contains Following Books: ");
					System.out.println("----------------------------------");
					displayBook(list);
					break;
				
				case 4:
					System.out.print("............ Thank You ............");
					break;
				
				default:
					System.out.println("Invalid Entry Please try again....");
					break;
			}
		}while(ch!=4);
	}
	
	public static void displayBook(List<Book> list)
	{
		Iterator<Book> it = list.iterator();
		int num = 1;
		while(it.hasNext())
		{
			Book s = it.next();
			System.out.println("Book "+num);
			s.printDetails();
			num++;
		}
	}
}



/*
Output:

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 2>javac Library.java

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 2>java Library
============ Welcome to Books Library ============
1. Add Book.
2.Delete Book.
3.Show Books.
4.Exit
Enter your choice: 1
============ Welcome to Books Library ============
Enter the Title of the Book : aa
Enter the Name of an Author of the Book : bb
Enter the Name of Publisher of the Book : cc
Enter the Numbers of Pages of the Book : 123
Enter the Price of the Book : 321.99
Book added Successfully...============ Welcome to Books Library ============
1. Add Book.
2.Delete Book.
3.Show Books.
4.Exit
Enter your choice: 1
============ Welcome to Books Library ============
Enter the Title of the Book : dd
Enter the Name of an Author of the Book : ee
Enter the Name of Publisher of the Book : ff
Enter the Numbers of Pages of the Book : 444
Enter the Price of the Book : 323
Book added Successfully...============ Welcome to Books Library ============
1. Add Book.
2.Delete Book.
3.Show Books.
4.Exit
Enter your choice: 1
============ Welcome to Books Library ============
Enter the Title of the Book : gg
Enter the Name of an Author of the Book : hh
Enter the Name of Publisher of the Book : ii
Enter the Numbers of Pages of the Book : 22
Enter the Price of the Book : 1
Book added Successfully...============ Welcome to Books Library ============
1. Add Book.
2.Delete Book.
3.Show Books.
4.Exit
Enter your choice: 3
============ Welcome to Books Library ============
Library Contains Following Books:
----------------------------------
Book 1
Title of the Book: aa
Name of an Author of the Book: bb
Name of Publisher of the Book: cc
Number of Pages of the Book: 123
Price of the Book: 321.99
----------------------------------------------------
Book 2
Title of the Book: dd
Name of an Author of the Book: ee
Name of Publisher of the Book: ff
Number of Pages of the Book: 444
Price of the Book: 323.0
----------------------------------------------------
Book 3
Title of the Book: gg
Name of an Author of the Book: hh
Name of Publisher of the Book: ii
Number of Pages of the Book: 22
Price of the Book: 1.0
----------------------------------------------------
============ Welcome to Books Library ============
1. Add Book.
2.Delete Book.
3.Show Books.
4.Exit
Enter your choice: 2
============ Welcome to Books Library ============
Enter Number of Book you want to Delete:2
Book Deleted Successfully...
============ Welcome to Books Library ============
1. Add Book.
2.Delete Book.
3.Show Books.
4.Exit
Enter your choice: 3
============ Welcome to Books Library ============
Library Contains Following Books:
----------------------------------
Book 1
Title of the Book: aa
Name of an Author of the Book: bb
Name of Publisher of the Book: cc
Number of Pages of the Book: 123
Price of the Book: 321.99
----------------------------------------------------
Book 2
Title of the Book: gg
Name of an Author of the Book: hh
Name of Publisher of the Book: ii
Number of Pages of the Book: 22
Price of the Book: 1.0
----------------------------------------------------
============ Welcome to Books Library ============
1. Add Book.
2.Delete Book.
3.Show Books.
4.Exit
Enter your choice: 4
============ Welcome to Books Library ============
............ Thank You ............
*/