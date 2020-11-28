import java.util.*;
class Power
{
    public static void main(String args[])
   {
    double a,n,c;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Base");
    n=in.nextDouble();
    System.out.println("Enter the Power");
    a=in.nextDouble();
    c=Math.pow(n,a);
    System.out.println("The answer is"+c);
    }
}