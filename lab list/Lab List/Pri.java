
/**
 * Write a description of class Pri here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Pri extends Thread
{  
    public void run()
    {  
        System.out.println("Running thread name is:"+Thread.currentThread().getName());  
        System.out.println("Running thread priority is:"+Thread.currentThread().getPriority());  
  
    }  
    public static void main(String args[])
    {  
        Pri m1=new Pri();  
        Pri m2=new Pri();  
        m1.setPriority(Thread.MIN_PRIORITY);  
        m2.setPriority(Thread.MAX_PRIORITY);  
        m1.start();  
        m2.start();  
   
    }  
}   