package com.leetcode;

public class ReverseWords {
	public static void main(String[] args) {
		String s = "a good  example";
		s = s.trim();
		s = s.replaceAll("\\s+", " ").trim();
		String[] reverse = s.split(" ");
		String result = "";

		for (int i = reverse.length - 1; i >= 0; i--) {

			result = result + " " + reverse[i];

		}
		System.out.println(result.trim());
	}

}
