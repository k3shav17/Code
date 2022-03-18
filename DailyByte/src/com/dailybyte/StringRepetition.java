package com.dailybyte;

import java.util.ArrayList;
import java.util.Scanner;

/*Given a string s, return all of its repeated 10 character substrings.
Note: You may assume s only contains uppercase alphabetical characters.

Ex: Given the following string s…

s = "BBBBBBBBBBB", return ["BBBBBBBBBB"].
Ex: Given the following string s…

s = "ABABABABABABBBBBBBBBBB", return ["ABABABABAB","BBBBBBBBBB"].*/

public class StringRepetition {

	public static void stringArray(String word) {

		ArrayList<String> result = new ArrayList<>();
		String concatSame = "", concatDiff = "";

		for (int i = 0; i < word.length() - 1; i++) {
			for (int j = i; j <= i; j++) {
				if (word.charAt(i) == word.charAt(j + 1)) {
					concatSame += word.charAt(j + 1);
				} else
					concatDiff += word.charAt(i);
			}
		}
		result.add(concatDiff);
		result.add(concatSame);

		System.out.println(result);

	}

	public static void main(String[] args) {

		System.out.println("Enter the word");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();

		StringRepetition.stringArray(word);
		in.close();
	}

}
