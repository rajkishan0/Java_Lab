
/**
 * This Program Sorts the Array and pushes all the zeros to the end of the array  using loop
 * I/P: None
 * O/P: The unsorted array, the sorted and all "Zeros" at the end Array
 * @author (Raj Kishan)
 * @version (05/08/2020)
 */
/* Java program to push zeroes to back of array */
import java.io.*; 
import java.util.Arrays; 
class Zero 
{ 
    
    static void pushZerosToEnd(int arr[], int n) 
    { 
        int count = 0;  
        for (int i = 0; i < n; i++) //traverses through the array
            if (arr[i] != 0) //Checks for Nonzero element
                arr[count++] = arr[i]; //Incrememt in Count
        while (count < n) //Adds the number of zeros found at the end of the array
            arr[count++] = 0; 
    } 
  
    
    public static void main (String[] args) 
    { 
        int arr[] = {6,5,8,9,0,1,2,4,0,7,0}; 
        for (int element: arr)//Create int "element" in go through all the elements
        System.out.println("The Sorted array elements are"+element);
        int n = arr.length; 
        Arrays.sort(arr); //Sorts the Array
        pushZerosToEnd(arr, n); //Function call 
        System.out.println("Array after sorting and pushing zeros to the end  "); 
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
    } 
} 