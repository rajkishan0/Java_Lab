package ABC;

import java.util.*;
class Var
{
    public static String StuName; //Raj
    private static String StuID; // 18PMC23004
    protected static int StuMark; //589
    static int Back; //00
    static void  Stu(String ID)
    {
        StuID= ID;
        System.out.println("Student ID number"+StuID); //Private Access Specifier -Within the same class
    }
}
public class Data extends Var
{
        public static void main (String args[])
         {
                    Scanner sc= new Scanner (System.in);
                    System.out.println("Enter Student ID number");
                    String ID=sc.next();
                    System.out.println("Enter Student name"); 
                    StuName=sc.next();
                    System.out.println("Enter Student's Overall Marks");
                    StuMark=sc.nextInt();
                    System.out.println("Enter No of Backs if Any");
                    Back=sc.nextInt();
                    Var.Stu(ID);
                    System.out.println("Student's Name:"+StuName); // Public Modifier accesible within the package
                    System.out.println("Student's Marks:"+StuMark); //Protected Modifier acccesible within the same package
                    System.out.println("No of Backs:"+Back); //Default Modifier accesibel within the same package
        }
        public int add(int a, int b)
        {
            System.out.println("This is to show Public modifier");
            return a+b;
       
        }
   
}

