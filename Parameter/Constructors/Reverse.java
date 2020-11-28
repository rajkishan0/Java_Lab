import java.util.Arrays; 

public class Reverse{
  public static void main(String[] args)
 {   
    
    int[] my_array= {
            6,10,14,1,5,7
        };        
    System.out.println("Original numeric array : "+Arrays.toString(my_array));
    for(int i=0;i<my_array.length/2; i++)
    {
     int temp= my_array[i];
     my_array[i]=my_array[my_array.length-i-1];
     my_array[my_array.length-i-1]= temp;
    }
    System.out.println("Reversed array : "+Arrays.toString(my_array));
    
    
    }
}