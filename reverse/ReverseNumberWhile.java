
/**
 * Write a description of class ReverseNumberWhile here.
 *
 * @author Kishan)
 * @version (a)
 */
import  java.util.Scanner;
class ReverseNumberWhile
{
    public static void main(String args[])
    {
        int num=0;
        int reversenum=0;
        System.out.println("Input the number to be reversed and press enter");
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        while(num != 0)
        {
               reversenum=reversenum*10;
               reversenum=reversenum+(num%10);
               num=num/10;
        }
        System.out.println("Reverse of Input number is: "+reversenum);
    }
}