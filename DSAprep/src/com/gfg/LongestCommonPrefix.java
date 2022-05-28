package com.gfg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Given a array of N strings, find the longest common prefix among all strings present in the array.
 * Example 1:
 * Input:
 * N = 4
 * arr[] = {geeksforgeeks, geeks, geek, geezer}
 * Output: gee
 * Explanation: "gee" is the longest common prefix in all the given strings.
 * Example 2:
 * 
 * Input: 
 * N = 2
 * arr[] = {hello, world}
 * Output: -1
 * Explanation: There's no common prefix in the given strings.
*/

public class LongestCommonPrefix {

	public static String longPrefix(List<String> words) {

		String word = words.get(0);

		for (int i = 1; i < words.size(); i++) {
			word = prefixUtisl(word, words.get(i));
		}
		return word;
	}

	public static String prefixUtisl(String first, String second) {

		String result = "";

		for (int i = 0, j = 0; i < first.length() && j < second.length(); i++, j++) {
			if (first.charAt(i) != second.charAt(j)) {
				break;
			}
			result += first.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println("enter the elements into the array, enter x when you are done");
		Scanner in = new Scanner(System.in);

		List<String> words = new ArrayList<String>();

		while (true) {

			String word = in.next();

			if (word.equalsIgnoreCase("x")) {
				break;
			} else
				words.add(word);
		}
		System.out.println(longPrefix(words));
		in.close();
	}
}
