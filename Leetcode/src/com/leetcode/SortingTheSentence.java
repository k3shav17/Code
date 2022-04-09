package com.leetcode;

public class SortingTheSentence {

	public static void main(String[] args) {

		String word = "is2 sentence4 This1 a3";
		String another = word.substring(0);
		System.out.println(sortSentence(word));
	}

	public static String sortSentence(String s) {

		String[] words = s.split(" ");
		int min = Integer.parseInt(String.valueOf(words[0].charAt(words[0].length() - 1)));
		String sentence = "";

		for (int i = 0; i < words.length; i++) {

			if (words[i].charAt(words[i].length() - 1) < min) {
				sentence += words[i];
			}
		}
		return sentence;

	}
}
