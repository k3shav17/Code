package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MostCommonWord {

	public static List<String> commonWord(String paragraph, String[] banned) {

		String[] words = paragraph.split("[\\p{Punct}\\s]+");
		List<String> repeated = new ArrayList<>();

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equalsIgnoreCase(words[j])) {
					repeated.add(words[i]);
				}
			}
		}
		return repeated;
	}

	public static void main(String[] args) {

		String[] banned = { "hit" };
		System.out.println(MostCommonWord.commonWord("Bob hit a ball, the hit BALL flew far after it was hit", banned));
	}
}
