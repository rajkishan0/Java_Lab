
/**
 * JAVA program to perform Binary Search 
 * I/P: None
 * O/P: The Array elements, The element to be searched and the position at which it's found
 * @author (Raj Kishan K)
 * @version (05/08/2020)
 */
import java.util.Arrays;  
class Search{  
    public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
        for (int element: arr)
        {
            System.out.println("The Sorted array elements are"+element);
        }
        int s = 30;  
        System.out.println("The array element to be searched is"+s);
        int result = Arrays.binarySearch(arr,s);  
        /*   This Searches the specified array of the given data type for the specified value using the binary search algorithm if the array is sorted*/
        if (result < 0)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
}  