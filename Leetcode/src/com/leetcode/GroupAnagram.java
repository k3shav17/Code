package com.leetcode;

public class GroupAnagram {

	public static boolean isValid(String str) {

		String withoutSpecialChars = "";

		for (int i = 0; i < str.length(); i++) {
			if ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122) {
				withoutSpecialChars += str.charAt(i);
			}
		}

		String reverseStr = "";

		for (int i = withoutSpecialChars.length() - 1; i >= 0; i--) {
			reverseStr += withoutSpecialChars.charAt(i);
		}

		System.out.println(withoutSpecialChars);
		System.out.println(reverseStr);
		return reverseStr.equals(withoutSpecialChars);
	}

	public static void main(String[] args) {

		String str = "A man, a plan, a canal: Panama";
		System.out.println(isValid(str.toLowerCase()));
	}
}
