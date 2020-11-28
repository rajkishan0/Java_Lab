
/**
 * Write a description of class Asc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Sort
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter the size of the array");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.println("Enter Array elements");
        try
        {
            for(int i=0;i<size;i++)
            {
                System.out.println("Element No. "+(i+1)+": “");
                arr[i]=sc.nextInt();
            }
        
            System.out.print("Before Sorting: ");
            for(int i=0;i<size;i++)
            System.out.print(" "+arr[i]);
        for(int i=0;i<size;i++)
        {
            int temp;
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                  }
            }
        }
            System.out.println();
            System.out.println("After Sorting in ascending order: ");
            for(int i=0;i<size;i++)
            {
                System.out.println(" "+arr[i]);
            }
            System.out.println();
            System.out.print("After Sorting in descending order: ");
            for(int i=size-1;i>=0;i--)
            {
                System.out.print(" "+arr[i]);
            }
            
        }
        catch ( InputMismatchException e)
        {
            System.out.println("Restart the program & Enter only numbers");
            
        }
  }
}