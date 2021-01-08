/**
* Author:jyothi
 * Create a method that can accept an array of String objects and sort in alphabetical order. 
 * The elements in the left half should be completely in uppercase and the elements in the right half should
 *  be completely in lower case. Return the resulting array.
 */
import java.util.Arrays;
public class Exercise2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        String[] array= {"a","ac","xvn","psj","ftt"};
        sortStrings(array);
        
	}
	
	public static String sortStrings(String[] array)
	{
		Arrays.sort(array);
		int len=array.length;
		for(int i=0;i<array.length;i++) {
			if(len%2==0)
			{
				if(i<(len/2))
				{
					System.out.println(array[i].toLowerCase());
				}
				else {
					System.out.println(array[i].toUpperCase());
				}
			}
			else 
			{
				if(i<=((len/2)-1))
				{
					System.out.println(array[i].toLowerCase());
				}
				else 
				{
					System.out.println(array[i].toUpperCase());
				}
			}	
			//System.out.println(array[i]);
		}
	return null;	
	}

	
}