
/**
 * I/P: Reads in a,b,c ( Co-effecients of the equation)
 * O/P: Calculates and displays real root if it exists, if the disc is negative, says it cant't caluclate 
 * @author Kishan
 * @version (21/06/2020)
 */
import java.util.*;
import java.lang.*;
public class Quadraticequation
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) 
  {  
      double r1,r2,t;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a");
    int a=in.nextInt();
    System.out.println("Enter b");
    int b=in.nextInt();
    System.out.println("Enter c");
    int c=in.nextInt();
    double d= ((b*b)-(4*a*c));
    t=Math.sqrt(d);
    
    if(d==0)
    {
        r1=(-b+t)/(2*a);r2=r1;System.out.println("The roots are"+r1+"and"+r2);
    }
   else if (d>0)
   {
       r1=(-b+t)/(2*a);r2= (-b-t)/(2*a);System.out.println("The roots are"+r1+"and"+r2);
    }
   else if(d<0)
   {
       System.out.println("Failed to calculate roots as square root is negative");  }
  }
}
