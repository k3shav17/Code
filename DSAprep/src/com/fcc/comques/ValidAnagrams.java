package com.fcc.comques;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s1 and s2 check if they're anagrams. Two strings are
 * anagrams if they're made of the same characters with the same frequencies.
 */
public class ValidAnagrams {

	public boolean areAnagrams(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;

		char[] stringOne = s1.toCharArray();
		char[] stringTwo = s2.toCharArray();

		Arrays.sort(stringOne);
		Arrays.sort(stringTwo);

		for (int c = 0; c < stringOne.length; c++) {
			if (stringOne[c] != stringTwo[c]) {
				return false;
			}
		}
		return true;
	}

	public boolean areAnagramsWithHT(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;

		Map<Character, Integer> freq1 = new HashMap<Character, Integer>();
		Map<Character, Integer> freq2 = new HashMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {
			freq1.put(s1.charAt(i), freq1.getOrDefault(s1.charAt(i), 0) + 1);
			freq2.put(s2.charAt(i), freq2.getOrDefault(s2.charAt(i), 0) + 1);
		}
		return freq1.equals(freq2);
	}

	public static void main(String[] args) {

		String s1 = "heart";
		String s2 = "earth";

		ValidAnagrams va = new ValidAnagrams();
//		System.out.println(va.areAnagrams(s1, s2));
		System.out.println(va.areAnagramsWithHT(s1, s2));
	}
}
