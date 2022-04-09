package com.tcs;

import java.util.Scanner;

public class NoOfVowelsAndConsonants {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String word = in.nextLine().toLowerCase();

		int vowelCount = 0, consonantCount = 0;

		for (int i = 0; i < word.length(); i++) {

			if ((word.charAt(i) >= 97 && word.charAt(i) <= 122)) {
				if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
						|| word.charAt(i) == 'u') {
					vowelCount++;
				} else consonantCount++;
			}
		}

		System.out.println("Number of vowels: " + vowelCount);
		System.out.println("Number of consonants: " + consonantCount);
		in.close();
	}
}
