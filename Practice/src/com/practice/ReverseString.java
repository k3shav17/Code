package com.practice;

public class ReverseString {

	public static void main(String[] args) {

		String word = "Hello World!";
		System.out.println(withSBButManually(word));
		System.out.println(withStringBuffer(word));

	}

	public static String withSBButManually(String word) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = word.length() - 1; i >= 0; i--) {
			sb.append(word.charAt(i));
		}
		return sb.toString();
	}

	public static String withStringBuffer(String word) {

		return new StringBuilder(word).reverse().toString();
	}

}
