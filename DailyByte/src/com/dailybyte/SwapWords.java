package com.dailybyte;

import java.util.Scanner;

/*Given a string s, reverse the words.
Note: You may assume that there are no leading or trailing whitespaces and each word within s is only separated by a single whitespace.

Ex: Given the following string s…

s = "The Daily Byte", return "Byte Daily The".*/

public class SwapWords {

	public static String reverseSentence(String sentence) {
		String reversed = "";
		String[] elements = sentence.split(" ");

		for (int i = elements.length - 1; i >= 0; i--) {

			reversed = reversed + elements[i] + " ";
		}
		return reversed;
	}

	public static void main(String[] args) {

		System.out.println("Enter the sentence to reverse");
		Scanner in = new Scanner(System.in);
		String sentence = in.nextLine();
		System.out.println(SwapWords.reverseSentence(sentence));
		in.close();

	}

}
