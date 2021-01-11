/**
 * author:jyothi
 * Write a Java program that displays the number of characters, lines and words in a text? 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
	public static class WordCountInFile {
		public static void main(String[] args) throws IOException {
			

			int charCount = 0;

			int wordCount = 0;

			int lineCount = 0;

			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\sai jyothi\\Desktop\\data\\data.txt"));

			String currentLine = reader.readLine();

			while (currentLine != null) {

				lineCount++;

				String[] words = currentLine.split(" ");

				wordCount += words.length;

				for (String word : words) {

					charCount += word.length();
				}

				currentLine = reader.readLine();
			}

			System.out.println("Number Of Chars In A File : " + charCount);

			System.out.println("Number Of Words In A File : " + wordCount);

			System.out.println("Number Of Lines In A File : " + lineCount);

		}
	}
}