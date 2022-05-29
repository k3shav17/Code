package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
*/
public class FirstUnique {

	public static int uniqueFirstCharAtIndex(String s) {

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}

		for (int j = 0; j < s.length(); j++) {
			if (map.containsKey(s.charAt(j)) && map.getOrDefault(s.charAt(j), 0) == 1) {
				return j;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String s = "aabb";
		System.out.println(uniqueFirstCharAtIndex(s));
	}
}
