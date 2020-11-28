//Parametrised Constructors
class MyClass
         {  int num;
                 MyClass(int i)
                  { num = i; 
                  } 
             }
             
public class Para 
 { 
        public static void main(String args[]) 
         {
                MyClass t1 = new MyClass(10);  
                MyClass t2 = new MyClass(20); 
                System.out.println(t1.num + "    " + t2.num); 
                
         }        
 }