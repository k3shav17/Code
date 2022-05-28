package com.ds;

import java.util.Stack;
import java.util.Scanner;

// Reversing a string using Stack
public class ReverseString {

	public static void main(String[] args) {
		System.out.println("enter the string");
		
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		
		char[] letters = new char[word.length()];
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < word.length(); i++) {
			stack.push(word.charAt(i));
		}
	
		int i = 0;
		while(!stack.isEmpty()) {
			
			letters[i++] = stack.pop();
		}
		
		System.out.println(new String(letters));
		in.close();
	}
}
