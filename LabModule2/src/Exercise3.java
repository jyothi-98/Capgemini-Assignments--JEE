/**
 * Author:jyothi
 Create a method which accepts an integer array, reverse the numbers in the array
 *  and returns the resulting array in sorted order
 */
import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	
	
	private static int[] getSorted(int arr[]) {
		int len = arr.length;
		int array1[] = new int[len];
		String str[] = new String[len];
		for(int i =0;i<len;i++) {
			str[i] = Integer.toString(arr[i]);
			
		StringBuffer s = new StringBuffer(str[i]);
		array1[i] = Integer.parseInt(s.reverse().toString());
		}
		Arrays.sort(array1);
		return array1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:of array elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int result[] = getSorted(arr);
		for(int i =0;i<result.length;i++) {
			System.out.println(result[i]+" ");
		}
		
		sc.close();
	}

}
