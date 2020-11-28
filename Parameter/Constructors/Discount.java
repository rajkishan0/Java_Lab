import  java.util.Scanner;
public class Discount
{
    public static void main ( String args[])
    {
        double disc=0.0;
        double tot=0.0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the total amount");
        double a=in.nextInt();
        System.out.println("The present  amount"+a);
        if ( a >=0 && a<=1000)
        {
            disc= 0.02;
            tot= a-( a*disc);
        }
        else if ( a >=1001 && a<=3000)
        {
            disc= 0.05;
            tot= a-( a*disc);
        }
        else if ( a >=3000 && a<=10000)
        {
            disc= 0.1;
            tot= a-( a*disc);
        }
        else if ( a >=10000)
        {
            disc= 0.2;
            tot= a-( a*disc);
        }
        System.out.println("The Amount to be paid after discount"+tot);
    }
}