
/**
 * Write a description of class Run here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Thr extends Thread
{  
    public void run()
    {  
        System.out.println("SINGLE THREAD is being executed"); 
    }  
    public static void main(String args[])
    {  
        Thr t1=new Thr();  
        t1.start();  
    }  
}  