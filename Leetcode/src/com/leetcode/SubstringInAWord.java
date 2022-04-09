package com.leetcode;

import java.util.Arrays;
import java.util.List;

public class SubstringInAWord {

	public static int numOfStrings(String[] patterns, String word) {

		int count = 0;

		List<String> patternsList = Arrays.asList(patterns);

		for (int i = 0; i < patternsList.size(); i++) {

			if (patternsList.get(i).contains(word)) {
				System.out.println(patternsList.get(i));
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		String[] patterns = {"a","abc","bc","d"};
		String word = "abc";
  		System.out.println(numOfStrings(patterns, word));
	}
}
