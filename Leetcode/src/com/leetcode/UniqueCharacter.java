package com.leetcode;

import java.util.ArrayList;

public class UniqueCharacter {

	public static void main(String[] args) {

		String s = "loveleetcode";

		ArrayList<Character> unique = new ArrayList<>();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; j < s.length() - 1; j++) {

				if (s.charAt(i) == s.charAt(j)) {
					count++;
					if (count == 0) {
						unique.add(s.charAt(i));
					}
				}
			}
		}

		System.out.println(s.indexOf(unique.get(0)));
	}

}
