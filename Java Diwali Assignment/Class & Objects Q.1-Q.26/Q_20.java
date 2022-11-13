//Q.20. String Constructor Program in Java
public class Q_20 
{ 
    public static void main(String[] args) 
    { 
	   char[] charArray = {'H','i',' ','S','A','N','K','E','T'}; 
	   byte[] ascii = {65,66,67,68,70,71,73}; 
	   String str  = "Welcome"; 
	   String strl = new String("Java"); 
	   String str2 = new String(charArray); 
	   String str3 = new String(charArray,3,3); 
	   String str4 = new String(ascii); 
	   String str5 = new String(ascii,2,3); 
	   String str6 = new String(); 
	   String str7 = new String(str); 
	   System.out.println("str : "+ str);	//Welcome
	   System.out.println("strl : "+ strl); //Java
	   System.out.println("str2 : "+ str2); //Hi SANKET
	   System.out.println("str3 : "+ str3); //SAN
	   System.out.println("str4 : "+ str4); //ABCDFGI
	   System.out.println("str5 : "+ str5); //CDF
	   System.out.println("str6 : "+ str6); //
	   System.out.println("str7 : "+ str7); //Welcome
	   str += " Sanket Raut"; 				
	   System.out.println("str : "+ str);	//Welcome Sanket Raut 
    } 
} 

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_20
str : Welcome
strl : Java
str2 : Hi SANKET
str3 : SAN
str4 : ABCDFGI
str5 : CDF
str6 :
str7 : Welcome
str : Welcome Sanket Raut
*/