/**
 * Create a method that accepts a number and modifies it such that the each of the digit 
 * in the newly formed number is equal to the difference between two consecutive digits in the original number.
 *  The digit in the units place can be left as it is. 
Note: Take the absolute value of the difference. Ex: 6-8 = 2

 */
import java.util.Scanner;
public class Exercise4 {

	public static int modifyNumber(int number) {
		String value = null;
		int temp =0;
		int ch;
		String string1 = Integer.toString(number);
		StringBuffer s = new StringBuffer();
		for (int index = 0; index < string1.length()-1; index++) {
			ch = -(string1.charAt(index) - string1.charAt(index + 1));
			s.append(ch);
		
		}
		
		value = s.toString();
		temp = Integer.parseInt(value);
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		System.out.println(modifyNumber(number));
		sc.close();
	}

}
