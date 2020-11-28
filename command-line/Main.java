
/**
 * Method Over-Riding Program
 * I/P: No input
 * O/P: Shows the given statement after performing method overriding
 * @author (Raj Kishan)
 * @version (28/07/2020)
 */
class Date{ 
    void show() 
    { 
        System.out.println("This shows date"); 
    } 
} 
  
// Inherited class 
class Day extends Date { 
    // This method overrides show() of Parent 
    @Override
    void show() 
    { 
        System.out.println("This shows Day"); 
    } 
} 
  
// Driver class 
public class Main { 
    public static void main(String[] args) 
    { 
        // If a Parent type reference refers 
        // to a Parent object, then Parent's 
        // show is called 
        Date obj1 = new Date(); 
        obj1.show(); 
  
        // If a Parent type reference refers 
        // to a Child object Child's show() 
        // is called. This is called RUN TIME 
        // POLYMORPHISM. 
        Date obj2 = new Day(); 
        obj2.show(); 
    } 
} 