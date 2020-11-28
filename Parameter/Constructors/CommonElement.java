import java.util.ArrayList; 
  
public class CommonElement { 
  
    // main method 
    public static void main(String[] args) 
    { 
  
        // create ArrayList list1 
        ArrayList<String> 
            list1 = new ArrayList<String>(); 
  
        // Add values in ArrayList 
        list1.add("Raj"); 
        list1.add("Kishan"); 
        list1.add("CS"); 
        list1.add("JAVA"); 
  
        // print list 1 
        System.out.println("List1: "
                           + list1); 
  
        // Create ArrayList list2 
        ArrayList<String> 
            list2 = new ArrayList<String>(); 
  
        // Add values in ArrayList 
        list2.add("Hii"); 
        list2.add("CS"); 
        list2.add("JAVA"); 
  
        // print list 2 
        System.out.println("List2: "
                           + list2); 
  
        // Find the common elements
        list1.retainAll(list2); 
  
        // print list 1 
        System.out.println("Common elements: "
                           + list1); 
    } 
} 