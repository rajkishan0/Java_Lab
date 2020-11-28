
/**
 * Program to sort an array, Eliminate the dupliacte elements and finding the length of the final array
 * I/P: None
 * O/P: Raw array, Modified Array, Length of the final array
 * @author (Raj Kishan K)
 * @version (05/08/2020)
 */
import java.io.*; 
import java.util.Arrays; 
class Duplicate
{ 
    static int removeDuplicates(int arr[], int n) 
    { 
        if (n==0 || n==1) //to check if list is empty
            return n; 
    
        int[] temp = new int[n]; //Create a temp array with the size of the old array
        int j = 0; 
        int c=0;
        for (int i=0; i<n-1; i++) //traversing
            if (arr[i] != arr[i+1]) //checking if the element is as same as the next one
                temp[j++] = arr[i]; //Adding if it isn't the same element
        temp[j++] = arr[n-1]; //For the last element
        for (int i=0; i<j; i++) //Copy the temporary array
        {
            c++;
            arr[i] = temp[i]; 
        }
        System.out.print("\n The length of the modified array is     "+c+"\n");
        return j; 
        
        
    } 
    
    public static void main (String[] args) 
    { 
        int arr[] = {1, 3, 2, 3, 6, 6, 4, 5, 5}; 
        int n = arr.length;
        System.out.println("The  array elements before modification  are ");
        for (int i=0; i<n; i++) 
		System.out.print(arr[i]+" ");
        Arrays.sort(arr); //Sorts the Array
        n = removeDuplicates(arr, n); 
        System.out.print("\nThe array elements after modification are ");
        for (int i=0; i<n; i++) 
		System.out.print(arr[i]+" "); 
	} 
} 
