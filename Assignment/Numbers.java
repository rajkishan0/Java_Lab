
/**
 * Program to seperate even and odd numbers
 * I/P: None
 * O/P: Seperated Even and Odd Numbers.
 * @author (Raj Kishan)
 * @version (05/08/2020)
 */
import java.io.*; 
import java.util.Arrays; 
public class  Numbers
{  
    public static void main(String args[])
    {  
        int a[]={1,2,3,6,5,7,4};  
        Arrays.sort(a);
        System.out.println("Odd Numbers:");  
        for(int i=0;i<a.length;i++)
        {  
            if(a[i]%2!=0)
            {  
                System.out.println(a[i]);  
            }  
        }  
        System.out.println("Even Numbers:");  
        for(int i=0;i<a.length;i++)
        {  
            if(a[i]%2==0)
            {  
                System.out.println(a[i]);  
            }  
        }  
    }
}  