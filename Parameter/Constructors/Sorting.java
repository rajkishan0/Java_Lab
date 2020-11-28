import java.util.Arrays; 

public class Sorting {
  public static void main(String[] args)
 {   
    
    int[] my_array= {
            6,10,14,1,5,7
        };        
    System.out.println("Original numeric array : "+Arrays.toString(my_array));
    Arrays.sort(my_array);
    System.out.println("Sorted numeric array : "+Arrays.toString(my_array));
    
    
    }
}