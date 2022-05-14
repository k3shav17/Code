package com.leetcode;

public class NumberOf1Bits {

	public static void main(String[] args) {
		
		String binary = "11111111111111111111111111111101";
		int count = 0;
		
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') count++;
		}
		System.out.println(count);
	}
}
