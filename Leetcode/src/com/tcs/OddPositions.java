package com.tcs;

import java.util.Scanner;

public class OddPositions {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String word = in.nextLine();
		
		String oddLetters = "";
		
		for (int i = 0; i < word.length(); i++) {
			if (i % 2 == 0) {
				oddLetters += word.charAt(i);
			}
		}
		System.out.println(oddLetters);
	}
}
