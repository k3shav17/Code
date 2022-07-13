package com.practice;

public class StringPractice {

	public static void main(String[] args) {
		
		String first = "one";
		String second = "one";
		
		String third = new String("three");
		String three = new String("three");
		
		String four = "three";
		System.out.println(first==second);
		System.out.println(third.equals(three));
		System.out.println(four==three);
		System.out.println(four.equals(three));
	}
}
