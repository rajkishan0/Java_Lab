/**
 * A method is OverRidden 
 *
 * @author (Kishan)
 * @version (01/10/2020)
 */
class Subject
{  
     void run()
    {
        System.out.println("This is Computer Science Class");
    }  
}  
public class Paper extends Subject
{  
  void run()
  {
      System.out.println("This is JAVA Paper");
  }  

   public static void main(String args[])
  {  
      Paper obj2 = new Paper();
      obj2.run();
  }  
 } 