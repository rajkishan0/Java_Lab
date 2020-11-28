
/**
 *  MultiLevel Inheritance Program.
 *
 * @author (Kishan)
 * @version (22/07/2020)
 */
import java.util.*;
class Match
{
    public void Match()
    {
        System.out.println(" RCB qualifies for Semi Final");
    }
    
}
class SemiFinal extends Match
{
   public void  SemiFinal()
    {
        System.out.println(" RCB qualifies for Final");
    }
     
}
public class Final extends SemiFinal
{
    public void Final()
    {
        System.out.println(" And the champion of IPL 2020 is");
    }
    
    public static void main(String[] args )
     {
         
         Scanner in=new Scanner(System.in);
         System.out.println("Enter ESCN");
         String ip=in.next();
         
         Final obj=new Final();
            obj.Match();
            obj.SemiFinal();
            obj.Final();
            
         if ("ESCN".equals(ip))
         {
             String  a= "\tRCB!!!";
             System.out.println(a);
             
          }
          else {
              System.out.println(" some other team because RCB let them win");
              System.out.println(" RCB might not have won IPL but it won our heart");
            }
            
            
            
     }
}