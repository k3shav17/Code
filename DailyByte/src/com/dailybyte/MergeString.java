package com.dailybyte;

import java.util.ArrayList;
import java.util.List;

/*
 * Given two strings, s and t, merge the two strings together alternating characters starting with s.
 * Note: If one string is longer than the other, append the remaining characters of the longer string at the end of the merged string.
 * 
 * s = "abc", t = "def", return "adbecf".
*/
public class MergeString {

	public String mergedWords(String first, String second) {

		List<Character> characters = new ArrayList<>();
		String merged = new String();

		for (int i = 0; i < first.length() || i < second.length(); i++) {
			if (first.length() > i) {
				characters.add(first.charAt(i));
			}
			if (second.length() > i) {
				characters.add(second.charAt(i));
			}
		}

		for (Character character : characters) {
			merged += character;
		}
		return merged;
	}

	public static void main(String[] args) {

		String first = "abcg";
		String second = "def";

		MergeString ms = new MergeString();
		System.out.println(ms.mergedWords(first, second));
	}
}
