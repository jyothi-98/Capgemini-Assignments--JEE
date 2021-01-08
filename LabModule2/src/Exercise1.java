/**
* Author:jyothi
 * Create a method which accepts an array of integer elements and
 *  return the second smallest element in the array
 */
import java.util.Scanner;

public class Exercise1 {
	
	private static void getSecondSmallest(int[] array) {
		int temp;
		int size = array.length;
		if (size < 2)  
	    {  
	        System.out.println(" Invalid Input ");  
	        return;  
	    }   
	    for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	            }
	         }
	    }
	  System.out.println("Second Smallest element is "+array[1]);
	}

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the no of elements to store");
		int n = s1.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i = 0;i < n;i++) {
			arr[i] = s1.nextInt();
		}
		getSecondSmallest(arr);
		
		
		
	}

	

	
}
