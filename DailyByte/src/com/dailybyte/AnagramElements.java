package com.dailybyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*You are given two integer arrays, A and B. 
 * B is an anagram of A meaning that B contains all the same elements of A but in a different order. 
 * Return an array that represents a mapping from every element in A to which index it occurs at in B.
Note: You may assume every element in A is unique.

Ex: Given the following A and B…

A = [8, 23, 2], B = [2, 23, 8], return [2, 1, 0] (8 appears at index 2 in B, 23 appears at index 1 in B, and 2 appears at index 0 in B).

Ex: Given the following A and B…

A = [9, 3, 1, 5, 2, 4], B = [2, 5, 1, 3, 4, 9], return [5,3,2,1,0,4].*/

public class AnagramElements {

	public static List<Integer> anagramsAtIndex(List<Integer> listA, List<Integer> listB) {
		List<Integer> index = new ArrayList<>();

		for (int i = 0; i < listA.size(); i++) {
			for (int j = 0; j < listA.size(); j++) {
				if (listA.get(i) == listB.get(j)) {
					index.add(j);
				}
			}
		}
		return index;
	}

	public static void main(String[] args) {

		System.out.println("Enter the elements in to the array A, Hit 0 when you are done");

		Scanner in = new Scanner(System.in);

		List<Integer> listA = new ArrayList<>();

		while (true) {
			int element = in.nextInt();

			if (element == 0) {
				break;
			}

			listA.add(element);

		}

		System.out.println("Enter the elements in to array B.");

		List<Integer> listB = new ArrayList<>();

		while (true) {

			int element = in.nextInt();

			if (element == 0) {
				break;
			}

			listB.add(element);
		}

		if (listA.size() == listB.size()) {
			System.out.println(AnagramElements.anagramsAtIndex(listA, listB));
		} else
			System.out.println("length of lists are different, they wont form anagrams.");
		in.close();
	}
}
