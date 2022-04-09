package com.leetcode;

public class StringsAreAlike {

	public static boolean halvesAreAlike(String s) {

		s = s.trim();
		s = s.toLowerCase();

		String firstHalf = s.substring(0, s.length() / 2);
		String secondHalf = s.substring(s.length() / 2, s.length());
		int firstVowel = 0, secondVowel = 0;

		for (int i = 0; i < s.length() / 2; i++) {

			if (firstHalf.charAt(i) == 'a' || firstHalf.charAt(i) == 'e' || firstHalf.charAt(i) == 'i'
					|| firstHalf.charAt(i) == 'o' || firstHalf.charAt(i) == 'u') {
				firstVowel++;
			}
			if (secondHalf.charAt(i) == 'a' || secondHalf.charAt(i) == 'e' || secondHalf.charAt(i) == 'i'
					|| secondHalf.charAt(i) == 'o' || secondHalf.charAt(i) == 'u') {
				secondVowel++;
			}
		}

		System.out.println(firstHalf + " " + firstVowel);
		System.out.println(secondHalf + " " + secondVowel);
		if (firstVowel == secondVowel) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		String s = "textbook";
		System.out.println(halvesAreAlike(s));

	}
}
