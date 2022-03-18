package com.dailybyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given a non-negative integer array, nums, return the maximum product you can create with two separate indices i and j.
Note: You may assume the product will not overflow.

Ex: Given the following nums…

nums = [4, 2, 5, 3], return 20 (5 * 4).

Ex: Given the following nums…

nums = [6, 2, 4, 3], return 24.*/

public class LargestProduct {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();

		System.out.println("Enter the elements in to the list");

		List<Integer> nums = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			nums.add(in.nextInt());
		}

		System.out.println(LargestProduct.maximumProduct(nums));
		in.close();
	}

	private static int maximumProduct(List<Integer> nums) {

		int max = nums.get(0);

		for (int i = 0; i < nums.size(); i++) {
			for (int j = i + 1; j < nums.size() - 1; j++) {
				if (nums.get(i) * nums.get(j) >= max) {
					max = nums.get(i) * nums.get(j);
				}
			}
		}
		
		return max;
	}
}
