package com.dailybyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*Given an array of words and a string of characters, chars, return the sum of the lengths of words that can be formed using only the chars.
Note: Each character within chars can only be used once.

Ex: Given the following words and chars…

words = ["abc", "cab"], chars = "bac", return 6 ("abc"'s length + "cab"'s length).*/

public class FormWords {

	public int formingWords(List<String> words, String chars) {

		List<String> sameChars = new ArrayList<String>();

		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() == chars.length()) {
				
				int count = 0;
				char[] wordAtIndex = words.get(i).toCharArray();
				char[] wordChar = chars.toCharArray();
				
				Arrays.sort(wordAtIndex);
				Arrays.sort(wordChar);
				
				for (int j = 0; j < words.get(i).length(); j++) {
					if (wordAtIndex[j] == wordChar[j]) {
						count++;
					}
					if (count == chars.length()) {
						sameChars.add(words.get(i));
					}
				}
			}
		}

		return sameChars.size() * chars.length();
	}

	public static void main(String[] args) {
		System.out.println("Enter the size of the list");
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		System.out.println("Enter the strings in to the list");

		List<String> words = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			words.add(in.next());
		}
		in.nextLine();
		System.out.println("Enter the words you wants to form with");
		String word = in.nextLine();

		FormWords formWords = new FormWords();
		System.out.println(formWords.formingWords(words, word));
		in.close();
	}
}
