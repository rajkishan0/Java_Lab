
/**
 * Write a description of class Sam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Sample
{  
 public static void main(String args[])
 {  
  try
  {  
    try
    {  
     System.out.println("going to divide 0 by 0");  
     int b =0/0;  
    }
    catch(ArithmeticException e)
    {
        System.out.println("Error Occured, Error is\t:"+e);
    }  
    
   
    try
    {  
        System.out.println("Trying to add in 4th position when array size is 3");
        int a[]=new int[3];  
        a[4]=4;  
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Error Occured, Error is\t:"+e);
    }  
     
   
  }
  catch(Exception e)
  {
      System.out.println("Exceptions took place");
  }  
  
  
 }  
}  