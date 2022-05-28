package com.hr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lexicograph {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

//		Scanner in = new Scanner(System.in);

		String word = "welcometojava";
		int parts = 3;

		List<String> subs = new ArrayList<>();
		for (int i = 0; i <= word.length() - parts; i++) {

			subs.add(word.substring(i, i + parts));

		}
		System.out.println(subs);
		Collections.sort(subs);
		System.out.println(subs);
	}
}