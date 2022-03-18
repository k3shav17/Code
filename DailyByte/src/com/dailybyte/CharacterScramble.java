package com.dailybyte;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CharacterScramble {
	public static void main(String[] args) {

		System.out.println("Enter two words");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first word > ");
		String firstWord = in.nextLine();
		System.out.print("Enter second word > ");
		String secondWord = in.nextLine();
		Set<Character> distinctChars = new HashSet<>();

		if (firstWord.length() <= secondWord.length()) {

			for (int i = 0; i < firstWord.length(); i++) {
				for (int j = i; j < secondWord.length(); j++) {
					if (firstWord.charAt(i) == secondWord.charAt(j)) {
						distinctChars.add(secondWord.charAt(j));
					}
				}
			}
		} else if (firstWord.length() > secondWord.length()) {
			System.out.println("Enter other pair of words");
		}
		if (distinctChars.size() == firstWord.length()) {
			System.out.println("true");
		} else
			System.out.println("false");

		in.close();
	}
}
