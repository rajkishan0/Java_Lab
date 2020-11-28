 
/**
 * Program to execute COnstructor Overloading
 *
 * @author (Raj Kishan K)
 * @version (01/10/2020)
 */ 
class Box 
{ 
    double width, height, depth; 
    Box(double w, double h, double d) 
    { 
        width = w; 
        height = h; 
        depth = d; 
    }
    Box() 
    { 
        width = height = depth = 2; 
    } 
    Box(int len) 
    { 
        width = height = depth = len; 
    } 
    Box(double w,double h)
    {
        width = w; 
        height = h; 
    }
    double volume() 
    { 
        return width * height * depth; 
    } 
} 
 
public class Cons
{ 
    public static void main(String args[]) 
    { 
        Box mybox1 = new Box(15, 22, 13); 
        Box mybox2 = new Box(); 
        Box mybox3 = new Box(8); 
        Box mybox4 = new Box(2.6,3.6);
  
        double vol;
        vol = mybox1.volume(); 
        System.out.println(" Volume of mybox1 is " + vol);
        vol = mybox2.volume(); 
        System.out.println(" Volume of mybox2 is " + vol);
        vol = mybox3.volume(); 
        System.out.println(" Volume of mycube is " + vol); 
        vol = mybox4.volume(); 
        System.out.println(" Volume of mycube is " + vol); 
    } 
} 