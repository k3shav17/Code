package com.dailybyte;

/*Given a string s, reverse all of its characters that are letters and return the resulting string.

Ex: Given the following string s…

s = "abc*a", return "acb*a".

Ex: Given the following string s…

s = "Ab&e]a-Ta", return "aT&a]e-bA".*/
import java.util.Scanner;

public class StringReverse {

	public static String characterVerification(String str) {

		String normalStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '*' && str.charAt(i) == '-') {
				normalStr = StringReverse.reversingCharacters(str, i);
				break;
			} else {
				for (int c = str.length() - 1; c >= 0; c--) {
					normalStr += str.charAt(c);
				}
			}
		}
		return normalStr;
	}

	public static String reversingCharacters(String str, int index) {

		String withChars = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != '*' && str.charAt(i) != '-') {
				withChars += str.charAt(i);
			}
		}
		withChars = withChars.substring(0, index) + str.charAt(index)
				+ withChars.substring(index + 1, withChars.length());
		
		return withChars;
	}

	public static void main(String[] args) {

		System.out.println("Enter a string to reverse based on the pattern");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		System.out.println(StringReverse.characterVerification(str));
		in.close();

	}
}
