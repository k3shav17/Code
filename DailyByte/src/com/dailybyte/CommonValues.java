package com.dailybyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given two integer arrays, nums1 and nums2, return the intersection of the two arrays (i.e. the elements they have in common).

Ex: Given the following nums1 and nums2...

nums1 = [1, 2, 2, 3], nums2 = [0, 2, 2, 5], return [2, 2].*/

public class CommonValues {

	public static List<Integer> sameNumbers(ArrayList<Integer> numsOne, ArrayList<Integer> numsTwo) {

		List<Integer> nums = new ArrayList<>();

		if (numsOne.size() >= numsTwo.size()) {

			for (int i = 0; i < numsOne.size(); i++) {
				for (int j = i + 1; j < numsTwo.size(); j++) {
					if (numsOne.get(i) == numsTwo.get(j)) {
						nums.add(numsOne.get(i));
					}
				}
			}
		}

		for (int i = 0; i < numsTwo.size(); i++) {
			for (int j = i + 1; j < numsOne.size(); j++) {
				if (numsTwo.get(i) == numsOne.get(j)) {
					nums.add(numsTwo.get(i));
				}
			}
		}
		return nums;
	}

	public static void main(String[] args) {

		System.out.println("Enter the sizes of the lists");
		Scanner in = new Scanner(System.in);
		int sizeOne = in.nextInt();
		int sizeTwo = in.nextInt();

		ArrayList<Integer> numsOne = new ArrayList<>();
		ArrayList<Integer> numsTwo = new ArrayList<>();

		System.out.println("Enter the elements into first array list");

		for (int i = 0; i < sizeOne; i++) {
			numsOne.add(in.nextInt());
		}

		System.out.println("Enter the elements into the second array list");

		for (int i = 0; i < sizeTwo; i++) {
			numsTwo.add(in.nextInt());
		}

		System.out.println(CommonValues.sameNumbers(numsOne, numsTwo));
		in.close();
	}

}
