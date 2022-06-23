package com.hr;

import java.util.Stack;

public class BalancedParanthesis {

	public static char[][] brackets = { { '(', ')' }, { '{', '}' }, { '[', ']' } };

	public static boolean isOpen(char open) {

		for (char[] c : brackets) {
			if (c[0] == open) {

				return true;
			}
		}
		return false;
	}

	public static boolean matches(char open, char close) {

		for (char[] c : brackets) {
			if (c[0] == open) {
				return c[1] == close;
			}
		}
		return false;
	}

	public static boolean isBalanced(String str) {

		Stack<Character> bracket = new Stack<>();

		for (Character c : str.toCharArray()) {

			if (isOpen(c)) {
				bracket.push(c);
			} else {
				if (bracket.isEmpty() || !matches(bracket.pop(), c)) {
					return false;
				}
			}
		}
		return bracket.isEmpty();
	}

	public static void main(String[] args) {

		String bracs = "({[]}";
		System.out.println(isBalanced(bracs));
	}

}
