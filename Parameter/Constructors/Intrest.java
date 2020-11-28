import java.util.*;
class Intrest
{
    public static void main(String args[])
   {
    double p=0,t,r,si,ci,a,n;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Principal:");
    p=in.nextInt();
    System.out.println("Enter the Time duration:");
    t=in.nextDouble();
    System.out.println("Enter the Rate of intrest:");
    r=in.nextDouble();
    
    
    si=(p*t*r)/100;
    System.out.println("The Simple Intrest is"+si);
    ci=p*(Math.pow((1 + r/100) ,  t));
    
    System.out.println("Compound Interest after "+ci);

    }
}