package com.gfg;

import java.util.Scanner;

public class ReverseAStringInPlace {

	public static String reverseInPlace(String word) {

		char[] letters = word.toCharArray();
		char temp = ' ';

		int i = 0, j = word.length() - 1;
		while (i < j) {
			temp = letters[i];
			letters[i] = letters[j];
			letters[j] = temp;
			i++;
			j--;
		}
		return new String(letters);
	}

	public static void main(String[] args) {

		System.out.println("enter the string to reverse");
		Scanner in = new Scanner(System.in);

		String word = in.nextLine();

		System.out.println(reverseInPlace(word));
		in.close();
	}
}
