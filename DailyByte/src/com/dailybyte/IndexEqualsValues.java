package com.dailybyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given a sorted integer array, nums, return the index within nums that the index is equal to the value at that index. 
 * If no such index exists, return -1.

Ex: Given the following nums…

nums = [0, 4, 8], return 0 (zero occurs at the 0th index).

Ex: Given the following nums…

nums = [1, 3, 7, 12], return -1.*/

public class IndexEqualsValues {

	public static int indexOfValue(List<Integer> nums) {

		int index = -1;

		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) == i) {
				index = i;
				break;
			}
		}
		return index;

	}

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		List<Integer> nums = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			nums.add(in.nextInt());
		}

		System.out.println(IndexEqualsValues.indexOfValue(nums));
		in.close();
	}
}
