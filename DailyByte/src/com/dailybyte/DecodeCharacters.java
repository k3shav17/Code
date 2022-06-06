package com.dailybyte;

import java.util.LinkedList;

/*Given an encoded string, s, return its decoded representation. 
 * The string s will be encoded as follows N[letters], meaning that the letters should be repeated N times in the decoded representation.
 * Note: You may assume s always encoded correctly 
 * (i.e. correct formatting of brackets, only positive values outside the brackets, and always lowercase alphabetical characters inside the brackets).
 * 
 * Ex: Given the following string s…
 * 
 * s = "3[a]2[b]1[c]", return "aaabbc" ("a" is repeated 3 times, "b" is repeated 2 times, and "c" is repeated 1 time).
 * */
public class DecodeCharacters {

	public static String encodedCharacters(String s) {

		LinkedList<Character> chars = new LinkedList<>();
		LinkedList<Integer> nums = new LinkedList<>();
		String decode = "";
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				
				chars.add(s.charAt(i));
			} 
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				nums.add(Integer.parseInt(String.valueOf(s.charAt(i))));
			}
		}
		
		for (int i = 0; i < chars.size(); i++) {
			for (int j = 0; j < nums.get(i); j++) {
				decode += chars.get(i);
			}
		}
		return decode;
	}

	public static void main(String[] args) {

		String s = "3[a]2[b]1[c]";
		System.out.println(encodedCharacters(s));
	}
}
