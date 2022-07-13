package com.practice;

public class Palindrome {

	public boolean isPalindrome(String word) {

		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - (i + 1))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String word = "rotor";
		Palindrome pali = new Palindrome();
		System.out.println(pali.isPalindrome(word));
	}
}
