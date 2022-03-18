package com.dailybyte;

/*
 * Given a string s and an integer array, indices, 
 * you must rearrange s according to the given indices. 
 * Once you have rearranged s successfully, the ith character in s should now be located at the indices[i] index.
 * Note: s and indices will always be the same length.

Ex: Given the following s and indices…

s = "abc", indices = [2, 1, 0], return "cba" ('a' moves to the 2nd index, b stays at the first index, and c moves to the zeroth index).
*/
import java.util.Scanner;

public class RearrangeString {

	public static void rearranged(String word, int[] indices) {

		/*
		 * String shuffled = ""; for (int i = 0; i < tempArr.length; i++) {
		 * 
		 * shuffled = shuffled + word.charAt(indices[i]);
		 * 
		 * }
		 */

		for (int i = 0; i < indices.length; i++) {
			System.out.print(word.charAt(indices[i]));
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the string");
		try (Scanner in = new Scanner(System.in)) {

			String word = in.nextLine();
			System.out.println(
					"Enter the array indices you want to change by giving it as an array\nNow enter the size of the array.");

			int size = in.nextInt();
			int[] indices = new int[size];
			System.out.println("Enter the indices");

			for (int i = 0; i < indices.length; i++) {
				indices[i] = in.nextInt();
			}
			RearrangeString.rearranged(word, indices);
		}

	}
}
