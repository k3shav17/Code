package com.dailybyte;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		System.out.println("Enter the word");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();

		System.out.println("enter other string or letter to find the occurance of that element in the previous string");
		String indexing = in.nextLine();
		ArrayList<Character> chars = new ArrayList<>();
		for (int i = 0; i < word.length(); i++) {
			chars.add(word.charAt(i));
		}

		for (int i = 0; i < word.length(); i++) {
			if (chars.equals(indexing)) {
				System.out.println(i);
			} else {
				System.out.println(-1);
			}
		}
		in.close();
	}

}
