package Matrix;


/**
 * Write a description of class MatrixSubraction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
 
public class MatrixSubtraction
{
    public void Sub() 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter The Number Of Rows");
         
        int row = sc.nextInt();
         
        System.out.println("Enter The Number Of Columns");
         
        int cols = sc.nextInt();
         
        int[][] matrix1 = new int[row][cols];
         
        int[][] matrix2 = new int[row][cols];
         
        int[][] sub = new int[row][cols];
         
        System.out.println("Enter The Data For First Matrix :");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }
         
        System.out.println("Enter The Data For Second Matrix :");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }
         
        System.out.println("First Matrix = ");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix1[i][j]+"\t");
            }
             
            System.out.println();
        }
         
        System.out.println("Second Matrix = ");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix2[i][j]+"\t");
            }
             
            System.out.println();
        }
         
        System.out.println("Subtraction = ");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                sub[i][j] = matrix1[i][j] - matrix2[i][j];
                 
                System.out.print(sub[i][j]+"\t");
            }
             
            System.out.println();
        }
    }
}