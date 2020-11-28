
/**
 * Write a description of class Run here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Run implements Runnable
{  
    public void run()
    {  
        System.out.println("SINGLE THREAD is being executed");  
    }  
  
    public static void main(String args[])
    {  
        Run m1=new Run();  
        Thread t1 =new Thread(m1);  
        t1.start();  
    }  
}  