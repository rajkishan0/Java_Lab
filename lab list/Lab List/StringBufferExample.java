
/**
 * Write a description of class aa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
class StringBufferExample
{  
    public static void main(String args[]) throws Exception
    {  
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);            
        System.out.println("Enter the String");    
        String name=br.readLine();  
        StringBuffer sb=new StringBuffer("Hello ");  
        sb.append(name);// Append method - Concatenates the string
        System.out.println(sb);
        sb.insert(1,"Is");//Insert method - At a particular position
        System.out.println(sb);
        sb.replace(1,3,"Java");   //Replace Method - Used to replace at a particular position
        System.out.println(sb);
        sb.delete(1,3);  // Delete Method 
        System.out.println(sb);
        sb.reverse();  // Reverse Method
        System.out.println(sb);
        System.out.println("string length is: "+sb.length()); // Length Method
        String str1= new String("Hello");
        String str2= new String("Hello");
	System.out.println("str1 equals to str2:"+str1.equals(str2)); //equals method
        String str = new String("ABC IS NOT EQUAL TO XYZ");
        System.out.println(str.toLowerCase()); // Lower Case
        System.out.println(str.toUpperCase()); // Upper Case
        
    }  
}  
