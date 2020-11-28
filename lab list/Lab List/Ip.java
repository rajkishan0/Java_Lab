 
import java.util.*; 
interface Cal
{
    public void add (double a, double b);
    public void sub (double a, double b);
    public void mul (double a, double b);
    public void divi (double a, double b);
}
public class Ip implements Cal
{
    static double x,y,z,d;
    public void add(double a, double b)
    {
       double m,n;
       m=a;
       n=b;
       x=m+n;
    }
    public void sub(double a, double b)
    {
       double m,n;
       m=a;
       n=b;
       y=m-n;
    }
    public void mul(double a, double b)
    {
       double m,n;
       m=a;
       n=b;
       z=m*n;
    }
    public void divi(double a, double b)
    {
       double m,n;
       m=a;
       n=b;
       d=m%n;
    }
    public void display()
    {
        System.out.println("Addition Values is" +x);
        System.out.println("Subraction Values is" +y);
        System.out.println("Multiplication Values is" +z);
        System.out.println("Division Values is" +d);
    }
     public static void main(String args[])
    { 
      Ip obj= new Ip();
      Scanner sc= new Scanner (System.in);
      System.out.println("Enter first  number");
      double g=sc.nextDouble();
      System.out.println("Enter Second  number");
      double h=sc.nextDouble();
      obj.add(g,h);
      obj.sub(g,h);
      obj.mul(g,h);
      obj.divi(g,h);
      obj.display();
    }
}