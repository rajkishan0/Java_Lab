
/**
 * A sample program to execute Multi-Level Inheritance
 *
 * @author (Raj Kishan K)
 * @version (01/10/2020)
 */
class Principal
{
   public void Principal()
   {
       System.out.println("This belongs to the class Principal");
   }  
}
class Teachers extends Principal
{
    String clg= "SJC";
   public void Teachers()
   {
    System.out.println("This belongs to the class Teachers");
    
   }
}
public class Students extends Teachers
{
   public void Students()
   {
    System.out.println("This belongs to class Students");
    System.out.println("All of them belong to the college:");
    System.out.println(super.clg);
   }
   
   public static void main(String args[])
   {
     Students obj=new Students();
     obj.Principal();
     obj.Teachers();
     obj.Students();
   }
}