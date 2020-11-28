 

 import java.util.Arrays;
public class Largest { 
      
    final static int N = 4; 
    final static int  M = 4 ; 
  
    
    private static void findMax(int mat[][]) 
    { 
  
        // Initializing max element as INT_MIN 
        int maxElement = Integer.MIN_VALUE; 
  
        // checking each element of matrix 
        // if it is greater than maxElement, 
        // update maxElement 
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < M; j++) { 
                if (mat[i][j] > maxElement) { 
                    maxElement = mat[i][j]; 
                } 
            } 
        } 
  
        // finally return maxElement 
        System.out.print("Maximum elementis" + maxElement);
        return ;
    } 
  
      
    
    public static void main(String args[]) 
    { 
           // matrix 
        int mat[][] = { { 1, 2, 3, 4 }, 
                          { 25, 6, 7, 8 }, 
                          { 9, 10, 11, 12 }, 
                          { 13, 14, 15, 16 } }; 
        for (int i = 0; i < mat.length; i++) 
        {
        // Loop through all elements of current row 

            for (int j = 0; j < mat[i].length; j++) 
            {

                System.out.println("The array elements are\t" +mat[i][j] + " \n");
            }
        }
          
       findMax(mat) ; 
    
    } 
    
} 