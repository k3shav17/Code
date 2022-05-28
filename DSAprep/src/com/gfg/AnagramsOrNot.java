package com.gfg;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsOrNot {

	public static boolean isAnagram(String first, String second) {

		boolean flag = false;
		if (first.length() != second.length()) {
			return flag;
		}
		char[] firstChars = first.toCharArray();
		char[] secondChars = second.toCharArray();

		Arrays.sort(firstChars);
		Arrays.sort(secondChars);

		for (int i = 0; i < first.length(); i++) {

			if (firstChars[i] != secondChars[i]) {
				flag = false;
				break;
			} else
				flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {

		System.out.println("enter the first word");
		Scanner in = new Scanner(System.in);
		String first = in.nextLine();

		System.out.println("enter the second word");
		String second = in.nextLine();

		System.out.println(isAnagram(first, second));
		in.close();
	}
}
