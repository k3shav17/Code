package com.dailybyte;

import java.util.ArrayList;
import java.util.Scanner;

/*This question is asked by Facebook. 
Given a string, check if it can be modified such that no two adjacent characters are the same. 
If it is possible, return any string that satisfies this condition and if it is not possible return an empty string.

Ex: Given the following string s…

s = "abb", return "bab".
Ex: Given the following string s…

s = "xxxy", return "" since it is not possible to modify s such that no two adjacent characters are the same.*/

public class NoSameNeighbours {

	public static void checkingNeighbours(String word) {

		ArrayList<Character> neighbours = new ArrayList<>();
		String result = "";
		boolean flag = false;
		char[] letters = word.toCharArray();

		for (int i = 0; i < word.length(); i++) {
			neighbours.add(letters[i]);
		}

		for (int i = 0; i < neighbours.size(); i++) {
			if (neighbours.contains(letters[i])) {
				flag = true;
			}
		}

		if (flag) {
			for (int i = 0; i < neighbours.size() - 1; i++) {
				if (neighbours.get(i) == neighbours.get(i + 1)) {
					result = result + neighbours.get(i + 1) + word.charAt(i);
				} result = result + neighbours.get(i + 1);
				System.out.println(result);
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {

		System.out.println("Enter a string");
		Scanner in = new Scanner(System.in);

		String word = in.nextLine();
		checkingNeighbours(word);
		in.close();

	}

}
