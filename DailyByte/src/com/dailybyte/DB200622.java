package com.dailybyte;

/*
 * Given an even length string, s, return whether or not the first half of s and the second half of s contain the same number of vowels.
 * 
 * Ex: Given the following string s…
 * 
 * s = "laptop", return true (there is one vowel in "lap" and one vowel in "top").
 * Ex: Given the following string s…
 * 
 * s = "computer", return false.
 */
public class DB200622 {

	public boolean hasSameVowelCount(String str) {

		String firstHalf = str.substring(0, str.length() / 2);
		String secondHalf = str.substring(str.length() / 2, str.length());

		int firstCount = 0, secondCount = 0;
		for (int vowel = 0; vowel < str.length() / 2; vowel++) {

			if (firstHalf.charAt(vowel) == 'a' || firstHalf.charAt(vowel) == 'e' || firstHalf.charAt(vowel) == 'i'
					|| firstHalf.charAt(vowel) == 'o' || firstHalf.charAt(vowel) == 'u') {

				firstCount++;
			}
			if (secondHalf.charAt(vowel) == 'a' || secondHalf.charAt(vowel) == 'e' || secondHalf.charAt(vowel) == 'i'
					|| secondHalf.charAt(vowel) == 'o' || secondHalf.charAt(vowel) == 'u') {
				secondCount++;
			}
		}
		return firstCount == secondCount;
	}

	public static void main(String[] args) {

		String str = "laptop";

		if (str.length() % 2 != 0) {
			System.out.println("Please enter an even length string");
		} else {
			DB200622 db = new DB200622();
			System.out.println(db.hasSameVowelCount(str.toLowerCase()));
		}
	}
}
