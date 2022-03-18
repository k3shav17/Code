package com.leetcode;

public class NeedleInHaystack {

	public static void main(String[] args) {

		String haystack = "hello", needle = "ll";
		String empty = "\"" +"";
		int firstOccur = 0;

		for (int i = 0 ; i < haystack.length(); i ++) {
			
			if (haystack.charAt(i) == needle.charAt(0)) {
				firstOccur = haystack.indexOf(haystack.charAt(i));
			}
		}
		System.out.println(firstOccur);
		System.out.println(empty);
	}

}
