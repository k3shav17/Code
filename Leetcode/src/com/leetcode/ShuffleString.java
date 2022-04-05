package com.leetcode;

public class ShuffleString {

	public static void main(String[] args) {

		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		String s = "codeleet";

		String shuffledString = "";
		for (int i = 0, j = 0; i < s.length(); i++, j++) {
			shuffledString += s.charAt(indices[j]);
		}

		System.out.println(shuffledString);
	}
}
