

/**
 * I/P: Command line Input to take in marks
 * O/P : Grade after calculation
 * @author (Raj Kishan )
 * @version (28/07/20)
 */
import  java.util.Scanner;
public class Grade
{
    public static void main ( String args[])
    {
        double tot=0;
        
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        int d=Integer.parseInt(args[3]);
        int e=Integer.parseInt(args[4]);
        int f=Integer.parseInt(args[5]);
        System.out.println("Your marks are\t"+a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f);
        
        tot= a+b+c+d+e+f;
        System.out.println("Total is="+tot+"out of 600");
        int num=0;
        if(tot>=0 && tot <=100)
        { num =1;}
        if(tot>=101 && tot <=200)
        { num =2;}
        if(tot>=201 && tot <=300)
        { num =3;}
        if(tot>=301 && tot <=400)
        { num =4;}
        if(tot>=401 && tot <=500)
        { num =5;}
        if(tot>=501 && tot <=600)
        { num =6;}
        switch(num)
        {
            case 1:
                System.out.println("your grade is C");
                break;
            case 2:
                System.out.println("your grade is C+");
                break;
            case 3:
                System.out.println("your grade is B");
                break;
            case 4:
                System.out.println("your grade is B+");
                break;
            case 5:
                System.out.println("your grade is A");
                break;
            case 6:
                System.out.println("your grade is A+");
                break;
            default:
                System.out.println("you failed");
                break;
               
            }
    }
}