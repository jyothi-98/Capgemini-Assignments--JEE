/**
 * Author:jyothi
 * Create a method that accepts a String and checks if it is a positive string. A string is considered a positive string,
 *  if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order. 
 *  For Example: ANT is a positive String (Since T comes after N and N comes after A). 
 * The method should return true if the entered string is positive.
 */
import java.util.*;

public class Exercise6 {

	public static boolean positiveString(String string1) {

		for (int index = 0; index < string1.length()-1; index++) {
			if (((string1.charAt(index))) > ((string1.charAt(index + 1)))) {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String....");
		String string1 = sc.next();
		System.out.println(positiveString(string1));
		sc.close();

	}

}
