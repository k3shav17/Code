package com.leetcode;

import java.util.Stack;

/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Example 1:
 * Input: s = "()"
 * Output: true
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * Input: s = "(]"
 * Output: false
*/
public class ValidParantheses {

	public static boolean isValid(String bracs) {

		Stack<Character> brackets = new Stack<>();

		for (char c : bracs.toCharArray()) {
			if (!brackets.isEmpty() && (brackets.peek() == c - 1 || brackets.peek() == c - 2)) {
				brackets.pop();
			} else
				brackets.push(c);
		}
		return brackets.isEmpty();
	}

	public static void main(String[] args) {
		String bracs = "()[]{}";
		System.out.println(isValid(bracs));
	}
}
