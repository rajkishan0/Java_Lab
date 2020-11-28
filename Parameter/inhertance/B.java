

/**
 * Single Level Inheritance Example
 *
 * @author (Kishan)
 * @version (15/07/20)
 */ 
import java.util.Scanner;
class A
{
    double a,c;
         
    void area(double rad)
    {
        
        a=3.14*rad*rad;
    }
    void cir(double rad)
    {
       
        
        c=2*3.14*rad;
    }
}
public class B extends A
{
   
     public static void main(String[] args )
     {
         
         Scanner in=new Scanner(System.in);
         System.out.println("Enter radius");
         double rad=in.nextInt();
         
         B d=new B();
         d.cir(rad);
         d.area(rad);
         System.out.println("The area is"+ d.a);
         System.out.println("Circumference is"+ d.c);
     }
}
        