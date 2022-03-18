package com.dailybyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given an array, nums, every value appears twice except for one which only appears once. 
 * The value that only appears once is the lucky number. Return the lucky number.

Ex: Given the following nums…

nums = [1, 2, 1], return 2.

Ex: Given the following nums…

nums = [1, 3, 1, 2, 2], return 3.*/

public class LuckyNumber {

	public static int extractingLuckyNum(List<Integer> nums) {

		int count = 0;
		int luckyNum = 0;

		for (int i = 0; i < nums.size(); i++) {
			count = 0;

			for (int j = 0; j < nums.size(); j++) {
				if (nums.get(i) == nums.get(j)) {
					count++;
				}
			}
			if (count == 1) {
				luckyNum = nums.get(i);
			}
		}
		return luckyNum;
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		System.out.println("Enter the elements");
		List<Integer> nums = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			nums.add(in.nextInt());
		}

		System.out.println(extractingLuckyNum(nums));
		in.close();
	}
}
