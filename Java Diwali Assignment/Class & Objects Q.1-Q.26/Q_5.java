//Q.5. Java Program to Illustrates Use of Referencing the Object from Inner Class
class OuterClass
{
    static OuterClass.InnerClass obj;
    void OuterMethod()
    {
        System.out.println("Outer class Method");
    }
	
    static public class InnerClass
    {
        public void InnerMethod()
        {
            OuterClass out = new OuterClass();
            out.OuterMethod();
        }
    }
}

public class Q_5
{
	 public static void main(String[] args)
    {
        OuterClass.obj = new OuterClass.InnerClass();
        OuterClass.obj.InnerMethod();
    }
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_5
Outer class Method
*/