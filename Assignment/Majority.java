
/**
 * Program to check if Majority Element exists
 * Majority element: The frequency of a number which is greater
   than the half of the size of the array size.
 * I/P: None
 * O/P: The Array, The Majority element
 * @author (Raj Kishan)
 * @version (05/08/2020)
 */
import java.io.*; 
import java.util.Arrays; 
class Majority
{ 
    static void findMajority(int arr[], int n) 
    { 
    int maxCount = 0; 
    int index = 0; 
    for(int i = 0; i < n; i++) //traverse through the array
    { 
        int count = 0; 
        for(int j = 0; j < n; j++) //traversing for the next element
        { 
            if(arr[i] == arr[j]) 
            count++; 
        } 
        
        if(count > maxCount) //To update if graeater element is found 
        { 
            maxCount = count; 
            index = i; 
        } 
    } 
    
    if (maxCount > n/2) //Check for majority condition
    System.out.println ("\nThe Majority element is\t"+arr[index]); 
    
    else
    System.out.println ("No Majority Element");
    } 
    
    public static void main (String[] args)
    { 
        int arr[] = {4, 4, 2, 4, 3, 5, 4}; 
        int n=arr.length;
        System.out.println("The  array elements  are ");
        for (int i=0; i<n; i++) 
		System.out.print(arr[i]+" ");
        findMajority(arr, n); 
    } 

} 
