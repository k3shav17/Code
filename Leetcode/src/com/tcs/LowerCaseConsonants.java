package com.tcs;

import java.util.Scanner;

public class LowerCaseConsonants {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String word = in.nextLine().toLowerCase();

		String consonants = "";

		for (int i = 0; i < word.length(); i++) {
			
			if ((word.charAt(i) >= 97 && word.charAt(i) <= 122)) {
				if (word.charAt(i) != 'a' && word.charAt(i) != 'e' && word.charAt(i) != 'i' && word.charAt(i) != 'o'
						&& word.charAt(i) != 'u') {
					
					consonants += word.charAt(i);
				}
			}
		}
		System.out.println(consonants);
		in.close();
	}
}
