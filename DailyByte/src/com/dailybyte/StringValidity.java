package com.dailybyte;

/*Given a string s that contains only the following characters: (, ), and *, 
 * where asterisks can represent either an opening or closing parenthesis, 
 * return whether or not the string can form a valid set of parentheses.

Ex: Given the following string s…

s = "*)", return true.

Ex: Given the following string s…

s = "(**)", return true.

Ex: Given the following string s…

s = "((*", return false.*/


import java.util.Scanner;

public class StringValidity {

	public static boolean validatingStrings(String str) {

		int starCount = 0;
		int bracketCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '*') {
				starCount++;
			} else if (str.charAt(i) == '(' || str.charAt(i) == ')') {
				bracketCount++;
			}
		}
		if (starCount != bracketCount) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {

		System.out.println("Enter the string");
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();

		System.out.println(StringValidity.validatingStrings(str));
		in.close();
	}
}
