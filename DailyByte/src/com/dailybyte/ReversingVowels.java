package com.dailybyte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//s = "computer", return "cemputor"
public class ReversingVowels {
	public static void main(String[] args) {

		System.out.println("Enter a string");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		ArrayList<Character> vowels = new ArrayList<>();
		int index = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {
				vowels.add(word.charAt(i));
			}
		}
		Collections.reverse(vowels);
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {
				System.out.print(vowels.get(index));
				index++;
			} else
				System.out.print(word.charAt(i));
			in.close();
		}
	}
}
