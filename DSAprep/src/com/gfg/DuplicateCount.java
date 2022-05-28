package com.gfg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCount {

	public static Map<Character, Integer> letterCount(String word) {

		Map<Character, Integer> repeatedChars = new HashMap<Character, Integer>();

		for (int i = 0; i < word.length(); i++) {
			int count = 0;
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j))
					count++;
			}
			if (count >= 2) {
				repeatedChars.put(word.charAt(i), count);
			}
		}
		return repeatedChars;
	}

	public static void main(String[] args) {
		System.out.println("enter a string");

		Scanner in = new Scanner(System.in);
		String word = in.nextLine();

		System.out.println(letterCount(word.toLowerCase()));
		in.close();
	}
}
