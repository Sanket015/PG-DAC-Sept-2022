// class - abstract Publication{data- noOfPages,price,publisherName}, Book, Journal, Library

import java.util.*;
abstract class Publication
{
	String publisherName;
	int noOfPages;
	double price;
	
	Publication()
	{}
	Publication(String publisherName,int noOfPages,double price)
	{
		this.publisherName = publisherName;
		this.noOfPages = noOfPages;
		this.price = price;
	}
	
	abstract void printDetails();
}

class Book extends Publication
{
	String bookName;
	String author;
	
	Book()
	{}
	Book(String bookName,String author,String publisherName,int noOfPages,double price)
	{
		super(publisherName,noOfPages,price);
		this.bookName = bookName;
		this.author = author;
	}
	
	public void printDetails()
	{
		System.out.println("Title of the Book: "+bookName);
		System.out.println("Name of an Author of the Book: "+author);
		System.out.println("Name of Publisher of the Book: "+publisherName);
		System.out.println("Number of Pages of the Book: "+noOfPages);
		System.out.println("Price of the Book: "+price);
		System.out.println("----------------------------------------------------");
	}
}

class Journal extends Publication
{
	String journalName;
	String writer;
	
	Journal()
	{}
	Journal(String journalName,String writer,String publisherName,int noOfPages,double price)
	{
		super(publisherName,noOfPages,price);
		this.journalName = journalName;
		this.writer = writer;
	}
	
	public void printDetails()
	{
		System.out.println("Title of the Journal: "+journalName);
		System.out.println("Name of Writer of the Journal: "+writer);
		System.out.println("Name of Publisher of the Journal: "+publisherName);
		System.out.println("Number of Pages of the Journal: "+noOfPages);
		System.out.println("Price of the Journal: "+price);
		System.out.println("----------------------------------------------------");
	}
}

public class Library
{
	public static void main(String[] args)
	{
		List<Book> bookList = new ArrayList<>();
		List<Journal> journalList = new ArrayList<>();
		
		int ch;
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("================== LIBRARY MANAGEMENT =================");
			System.out.println("1. ADD Book \n2. DELETE Book \n3. ADD Journal \n4. DELETE Journal \n5. SHOW Books \n6. SHOW Journals \n7. EXIT");
			System.out.print("Enter your choice: ");
			ch =sc.nextInt();
			sc.nextLine();
			System.out.println("================== LIBRARY MANAGEMENT =================");
			switch(ch)
			{
				case 1:
					System.out.print("Enter the Title of the Book : ");
					String bookName = sc.nextLine();
					System.out.print("Enter the Name of an Author of the Book : ");
					String author = sc.nextLine();
					System.out.print("Enter the Name of Publisher of the Book : ");
					String publisherName = sc.nextLine();
					System.out.print("Enter the Numbers of Pages of the Book : ");
					int numOfPages = sc.nextInt();
					System.out.print("Enter the Price of the Book : ");
					float price = sc.nextFloat();
					bookList.add(new Book(bookName,author,publisherName,numOfPages,price));
					System.out.println("Book added Successfully...");
					break;
				
				case 2:
					System.out.print("Enter Number of Book you want to Delete:");
					int n1 = sc.nextInt();
					Book b = bookList.remove(n1-1);
					System.out.println("Book Deleted Successfully...");
					break;
					
				case 3:
					System.out.print("Enter the Title of the Journal : ");
					String journalName = sc.nextLine();
					System.out.print("Enter the Name of an Writer of the Journal : ");
					String writer = sc.nextLine();
					System.out.print("Enter the Name of Publisher of the Journal : ");
					publisherName = sc.nextLine();
					System.out.print("Enter the Numbers of Pages of the Journal : ");
					numOfPages = sc.nextInt();
					System.out.print("Enter the Price of the Journal : ");
					price = sc.nextFloat();
					journalList.add(new Journal(journalName,writer,publisherName,numOfPages,price));
					System.out.println("Journal added Successfully...");
					break;
				
				case 4:
					System.out.print("Enter Number of Journal you want to Delete:");
					int n2 = sc.nextInt();
					Journal j = journalList.remove(n2-1);
					System.out.println("Journal Deleted Successfully...");
					break;
				
				case 5:
					System.out.println("Library Contains Following Books: ");
					System.out.println("----------------------------------");
					displayBook(bookList);
					break;
					
				case 6:
					System.out.println("Library Contains Following Journals: ");
					System.out.println("-------------------------------------");
					displayJournals(journalList);
					break;
				
				case 7:
					System.out.print("............ Thank You ............");
					break;
				
				default:
					System.out.println("Invalid Entry Please try again....");
					break;
			}
		}while(ch!=7);
	}
	
	public static void displayBook(List<Book> bList)
	{
		Iterator<Book> it = bList.iterator();
		int num1 = 1;
		while(it.hasNext())
		{
			Book b1 = it.next();
			System.out.println("Book "+num1);
			b1.printDetails();
			num1++;
		}
	}
	
	public static void displayJournals(List<Journal> jList)
	{
		Iterator<Journal> it = jList.iterator();
		int num2 = 1;
		while(it.hasNext())
		{
			Journal j1 = it.next();
			System.out.println("Journal "+num2);
			j1.printDetails();
			num2++;
		}
	}
}


/*
Output:

C:\Users\Sanket\OneDrive\Desktop\CDAC\Module 2 OOPJ\Module 2 OOPJ Assignments\Module 2 OOPJ Assignment 3>java Library
================== LIBRARY MANAGEMENT =================
1. ADD Book
2. DELETE Book
3. ADD Journal
4. DELETE Journal
5. SHOW Books
6. SHOW Journals
7. EXIT
Enter your choice: 1
================== LIBRARY MANAGEMENT =================
Enter the Title of the Book : Java
Enter the Name of an Author of the Book : Stark
Enter the Name of Publisher of the Book : Stark Tech
Enter the Numbers of Pages of the Book : 999
Enter the Price of the Book : 343.9
Book added Successfully...
================== LIBRARY MANAGEMENT =================
1. ADD Book
2. DELETE Book
3. ADD Journal
4. DELETE Journal
5. SHOW Books
6. SHOW Journals
7. EXIT
Enter your choice: 1
================== LIBRARY MANAGEMENT =================
Enter the Title of the Book : C++
Enter the Name of an Author of the Book : Rock
Enter the Name of Publisher of the Book : WWE
Enter the Numbers of Pages of the Book : 888
Enter the Price of the Book : 432.99
Book added Successfully...
================== LIBRARY MANAGEMENT =================
1. ADD Book
2. DELETE Book
3. ADD Journal
4. DELETE Journal
5. SHOW Books
6. SHOW Journals
7. EXIT
Enter your choice: 1
================== LIBRARY MANAGEMENT =================
Enter the Title of the Book : C
Enter the Name of an Author of the Book : Hulk
Enter the Name of Publisher of the Book : Marvel
Enter the Numbers of Pages of the Book : 66
Enter the Price of the Book : 100
Book added Successfully...
================== LIBRARY MANAGEMENT =================
1. ADD Book
2. DELETE Book
3. ADD Journal
4. DELETE Journal
5. SHOW Books
6. SHOW Journals
7. EXIT
Enter your choice: 3
================== LIBRARY MANAGEMENT =================
Enter the Title of the Journal : Biology
Enter the Name of an Writer of the Journal : Raj
Enter the Name of Publisher of the Journal : Navneet
Enter the Numbers of Pages of the Journal : 60
Enter the Price of the Journal : 50
Journal added Successfully...
================== LIBRARY MANAGEMENT =================
1. ADD Book
2. DELETE Book
3. ADD Journal
4. DELETE Journal
5. SHOW Books
6. SHOW Journals
7. EXIT
Enter your choice: 3
================== LIBRARY MANAGEMENT =================
Enter the Title of the Journal : Chemistry
Enter the Name of an Writer of the Journal : Shyam
Enter the Name of Publisher of the Journal : Navneet
Enter the Numbers of Pages of the Journal : 50
Enter the Price of the Journal : 44
Journal added Successfully...
================== LIBRARY MANAGEMENT =================
1. ADD Book
2. DELETE Book
3. ADD Journal
4. DELETE Journal
5. SHOW Books
6. SHOW Journals
7. EXIT
Enter your choice: 3
================== LIBRARY MANAGEMENT =================
Enter the Title of the Journal : Physics
Enter the Name of an Writer of the Journal : Ram Patil
Enter the Name of Publisher of the Journal : Chetan pvt
Enter the Numbers of Pages of the Journal : 55
Enter the Price of the Journal : 99
Journal added Successfully...
================== LIBRARY MANAGEMENT =================
1. ADD Book
2. DELETE Book
3. ADD Journal
4. DELETE Journal
5. SHOW Books
6. SHOW Journals
7. EXIT
Enter your choice: 5
================== LIBRARY MANAGEMENT =================
Library Contains Following Books:
----------------------------------
Book 1
Title of the Book: Java
Name of an Author of the Book: Stark
Name of Publisher of the Book: Stark Tech
Number of Pages of the Book: 999
Price of the Book: 343.8999938964844
----------------------------------------------------
Book 2
Title of the Book: C++
Name of an Author of the Book: Rock
Name of Publisher of the Book: WWE
Number of Pages of the Book: 888
Price of the Book: 432.989990234375
----------------------------------------------------
Book 3
Title of the Book: C
Name of an Author of the Book: Hulk
Name of Publisher of the Book: Marvel
Number of Pages of the Book: 66
Price of the Book: 100.0
----------------------------------------------------
================== LIBRARY MANAGEMENT =================
1. ADD Book
2. DELETE Book
3. ADD Journal
4. DELETE Journal
5. SHOW Books
6. SHOW Journals
7. EXIT
Enter your choice: 6
================== LIBRARY MANAGEMENT =================
Library Contains Following Journals:
-------------------------------------
Journal 1
Title of the Journal: Biology
Name of Writer of the Journal: Raj
Name of Publisher of the Journal: Navneet
Number of Pages of the Journal: 60
Price of the Journal: 50.0
----------------------------------------------------
Journal 2
Title of the Journal: Chemistry
Name of Writer of the Journal: Shyam
Name of Publisher of the Journal: Navneet
Number of Pages of the Journal: 50
Price of the Journal: 44.0
----------------------------------------------------
Journal 3
Title of the Journal: Physics
Name of Writer of the Journal: Ram Patil
Name of Publisher of the Journal: Chetan pvt
Number of Pages of the Journal: 55
Price of the Journal: 99.0
----------------------------------------------------
================== LIBRARY MANAGEMENT =================
1. ADD Book
2. DELETE Book
3. ADD Journal
4. DELETE Journal
5. SHOW Books
6. SHOW Journals
7. EXIT
Enter your choice: 2
================== LIBRARY MANAGEMENT =================
Enter Number of Book you want to Delete:2
Book Deleted Successfully...
================== LIBRARY MANAGEMENT =================
1. ADD Book
2. DELETE Book
3. ADD Journal
4. DELETE Journal
5. SHOW Books
6. SHOW Journals
7. EXIT
Enter your choice: 5
================== LIBRARY MANAGEMENT =================
Library Contains Following Books:
----------------------------------
Book 1
Title of the Book: Java
Name of an Author of the Book: Stark
Name of Publisher of the Book: Stark Tech
Number of Pages of the Book: 999
Price of the Book: 343.8999938964844
----------------------------------------------------
Book 2
Title of the Book: C
Name of an Author of the Book: Hulk
Name of Publisher of the Book: Marvel
Number of Pages of the Book: 66
Price of the Book: 100.0
----------------------------------------------------
================== LIBRARY MANAGEMENT =================
1. ADD Book
2. DELETE Book
3. ADD Journal
4. DELETE Journal
5. SHOW Books
6. SHOW Journals
7. EXIT
Enter your choice: 4
================== LIBRARY MANAGEMENT =================
Enter Number of Journal you want to Delete:3
Journal Deleted Successfully...
================== LIBRARY MANAGEMENT =================
1. ADD Book
2. DELETE Book
3. ADD Journal
4. DELETE Journal
5. SHOW Books
6. SHOW Journals
7. EXIT
Enter your choice: 6
================== LIBRARY MANAGEMENT =================
Library Contains Following Journals:
-------------------------------------
Journal 1
Title of the Journal: Biology
Name of Writer of the Journal: Raj
Name of Publisher of the Journal: Navneet
Number of Pages of the Journal: 60
Price of the Journal: 50.0
----------------------------------------------------
Journal 2
Title of the Journal: Chemistry
Name of Writer of the Journal: Shyam
Name of Publisher of the Journal: Navneet
Number of Pages of the Journal: 50
Price of the Journal: 44.0
----------------------------------------------------
================== LIBRARY MANAGEMENT =================
1. ADD Book
2. DELETE Book
3. ADD Journal
4. DELETE Journal
5. SHOW Books
6. SHOW Journals
7. EXIT
Enter your choice: 7
================== LIBRARY MANAGEMENT =================
............ Thank You ............
*/