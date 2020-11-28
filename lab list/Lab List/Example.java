
/**
 * Write a description of class abs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Trial
{ 
    public abstract void op1(); //Abstract Class without body
    public final void op2()
    {
        System.out.println("Final Keyword is used"); //Usage of Keyword Final
    } 
    static void op3() 
    { 
        System.out.println("Static keywword is used"); //Statetement to use Static Keyword
    } 
} 


public class Example extends Trial
 { 
    public void op1() 
    { 
        System.out.println("Abstract Keyword is used"); //Overriding Abstract Class for full implementation
    } 
    public static void main(String args[]) 
    { 
        Trial obj = new Example(); 
        obj.op1(); //Calls Abstract method which is overridden
        obj.op2(); //Calls Final method
        Trial.op3(); //Calls Static Method (Using Class Name)
    } 
}