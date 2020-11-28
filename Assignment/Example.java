
 
/**
 * Program to use Static, Final, Abstract keywords in a single program
 * I/P: None
 * O/P: Proof that all 3 keywords are used.
 * @author (Raj Kishan)
 * @version (06/08/2020)
 */

abstract class Trial
{ 
    public abstract void op1(); 
    public final void op2()
    {
        System.out.println("Final Keyword is used");
    } 
    static void op3() 
    { 
        System.out.println("Static keywword is used"); 
    } 
} 


public class Example extends Trial
 { 
    public void op1() 
    { 
        System.out.println("Abstract Keyword is used"); 
    } 
    public static void main(String args[]) 
    { 
        Trial obj = new Example(); 
        obj.op1(); 
        obj.op2();
        obj.op3();
    } 
} 