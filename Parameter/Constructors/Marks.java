import  java.util.Scanner;
public class Marks
{
    public static void main ( String args[])
    {
        double tot=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your English marks");
        int a= in.nextInt();
        System.out.println("Enter your Kannada marks");
        int b= in.nextInt();
        System.out.println("Enter your Maths marks");
        int c= in.nextInt();
        System.out.println("Enter your Social Science marks");
        int d= in.nextInt();
        System.out.println("Enter your Science marks");
        int e= in.nextInt();
        System.out.println("Enter your Hindi marks");
        int f= in.nextInt();
        tot= a+b+c+d+e+f;
        System.out.println("Totl="+tot);
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
                System.out.println("C");
                break;
            case 2:
                System.out.println("C+");
                break;
            case 3:
                System.out.println("B");
                break;
            case 4:
                System.out.println("B+");
                break;
            case 5:
                System.out.println("A");
                break;
            case 6:
                System.out.println("A+");
                break;
            default:
                System.out.println("you failed");
                break;
               
            }
    }
}