package com.dailybyte;

/*Given a string, s, return whether or not some permutation of s could form a palindrome.

Ex: Given the following string s…

s = "aeae", return true ("aeea" or "eaae").

Ex: Given the following string s…

s = "computer", return false.*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PalindromePossibility {

	public static boolean palindromeOrNot(String word) {

		boolean flag = false;

		if (word.length() % 2 == 0) {

			char[] characters = word.toCharArray();

			Arrays.sort(characters);

			Set<Character> repetition = new HashSet<>();

			for (int i = 0; i < characters.length; i++) {
				repetition.add(characters[i]);
			}

			if (repetition.size() == (word.length() / 2)) {

				flag = true;

			}
		} else if (word.length() % 2 != 0) {

			char[] characters = word.toCharArray();

			Arrays.sort(characters);

			Set<Character> repetition = new HashSet<Character>();

			for (int i = 0; i < characters.length; i++) {
				repetition.add(characters[i]);
			}

			if (repetition.size() == (word.length() / 2)) {
				flag = true;
			}

			System.out.println(repetition);
		}
		return flag;
	}

	public static void main(String[] args) {

		System.out.println("Enter the string you wants to check whether there is a possibility of palindrome");

		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		if (word.length() > 7 || word.length() % 2 == 0) {
			System.out.println(palindromeOrNot(word));

		} else
			System.out.println(
					"Sorry!, This program only works for word length greater than 7 if the length is odd else word with even numbers less than 8 will work\nSimply words with odd length less than 7 won't work");
		in.close();
	}
}
