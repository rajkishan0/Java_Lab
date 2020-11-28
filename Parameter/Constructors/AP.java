import java.lang.*;
public class AP
{
    public static void main (String[] args)
    {
        //To get random numbers using Math.random function
        AP rand = new AP();
        int min=1;
        int max= 101;
        double x= Math.random()*( max-min+1)+min;
        double y= Math.random()*( max-min+1)+min;
        double a= x+y;
        double b= x-y;
        double c=x*y;
        double d=x/y;
        double e=x%y;
        System.out.println(" Random Number 1:"+x);
        System.out.println(" Random Number 2:"+y);
        System.out.println("Addition :"+a);
        System.out.println("Subraction:"+b);
        System.out.println("Multiplication:"+c);
        System.out.println("Division:"+d);
        System.out.println("Modulus:"+e);
    }
}