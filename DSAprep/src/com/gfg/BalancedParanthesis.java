package com.gfg;

public class BalancedParanthesis {

	static char[] brackets = { '(', ')' };

	public boolean isBalanced(String str) {

		int bracket = 0;

		for (Character c : str.toCharArray()) {
			if (c == brackets[0]) {
				bracket++;
			} else {
				bracket--;
			}
		}
		return bracket == 0;
	}

	public static void main(String[] args) {

		String str = "()))";

		BalancedParanthesis bp = new BalancedParanthesis();
		System.out.println(bp.isBalanced(str));
	}
}
