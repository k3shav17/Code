package com.dailybyte;

import java.util.ArrayList;
import java.util.Scanner;

/*This question is asked by Apple. Given a string and a character, 
 * return an array of integers where each index is the shortest distance from the character.
Ex: Given the following string s and character s...

s = "dailybyte", c = 'y', return [4, 3, 2, 1, 0, 1, 0, 1, 2]*/
public class ShortestDistance {

	public static ArrayList<Integer> distanceToChar(String word, String letter) {

		int position = word.indexOf(letter);
		ArrayList<Integer> distance = new ArrayList<>();

		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) == letter.charAt(0)) {
				position = i;
				distance.add(0);
			} else
				distance.add(Math.abs(position - word.indexOf(word.charAt(i))));
			System.out.println(position);
		}
		return distance;
	}

	public static void main(String[] args) {

		System.out.println("Enter the word and the character that you want the distance");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		String letter = in.nextLine();

		System.out.println(ShortestDistance.distanceToChar(word, letter));
		in.close();
	}

}
