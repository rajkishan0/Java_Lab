package Matrix;
import Matrix.*;
import java.util.Scanner;
/**
 * Sample class to implement Matrix Opeartions Package
 *
 * @author (Kishan)
 * @version (19/08/2020)
 */
public class Trial
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want to create a matrix enter 1  \n for addition of 2 matrices enter 2 \n for subraction enter 3 \n for multiplication enter 4");
        int a = sc.nextInt();
        String op="Success";
        switch(a)
        {
         case 1:
         System.out.println("You have choosen to create a matrix");
         Matrix.MatrixCreation obj=new Matrix.MatrixCreation();
         obj.Create();
         break;
         case 2:
          System.out.println("You have choosen to add a matrix");
         Matrix.MatrixAddition obj2=new Matrix.MatrixAddition();
         obj2.Add();
          break;
          case 3:
          System.out.println("You have choosen to Subract a matrix");
         Matrix.MatrixSubtraction obj3=new Matrix.MatrixSubtraction();
         obj3.Sub();
          break;
          case 4:
          System.out.println("You have choosen to add a matrix");
         Matrix.MatrixMultiplication obj4=new Matrix.MatrixMultiplication();
         obj4.Mult();
          break;
        default:
        System.out.println("Enter Valid Choice");
            
        }
    }
}
