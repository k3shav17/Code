package com.tcs;

import java.util.Scanner;

public class SmallestVowel {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String word = in.nextLine().toLowerCase();

		char min = word.charAt(0);

		for (int i = 0; i < word.length(); i++) {
			if ((int) word.charAt(i) < (int) min) {

				min = word.charAt(i);
			}
		}
		System.out.println(min);
		in.close();
	}
}

class Solution{
	
}