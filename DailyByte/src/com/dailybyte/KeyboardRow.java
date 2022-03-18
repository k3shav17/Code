package com.dailybyte;

import java.util.Scanner;

/*Given a list of words, return all the words that require only a single row of a keyboard to type.
Note: You may assume that all words only contain lowercase alphabetical characters.

Ex: Given the following list of words…

words = ["two", "dad", "cat"], return ["two", "dad"].
Ex: Given the following list of words…

words = ["ufo", "xzy", "byte"], return [].*/

public class KeyboardRow {

	public static void keyboard(String[] words) {
		
		

	}

	public static void main(String[] args) {

		System.out.println("Enter number of words that you want to enter");
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		String[] words = new String[size];

		for (int i = 0; i < size; i++) {
			words[i] = in.nextLine();
		}
		keyboard(words);
		in.close();

	}

}
