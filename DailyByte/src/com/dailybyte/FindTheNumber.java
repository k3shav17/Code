package com.dailybyte;

/*Given an array of integers, nums, and a value k, return the kth largest element.

Ex: Given the following array nums…

[1, 2, 3], k = 1, return 3.
Ex: Given the following array nums…

[9, 2, 1, 7, 3, 2], k = 5, return 2.*/

import java.util.Arrays;
import java.util.Scanner;

public class FindTheNumber {

	public static int largestKthNumber(int[] nums, int kth) {

		if (kth > nums.length) {
			return 0;
		}

		int[] newNums = new int[nums.length];
		for (int i = kth; i < nums.length; i++) {
			newNums[i] = nums[i];
		}

		Arrays.sort(newNums);
		return newNums[newNums.length - 1];
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of the numbers array");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			nums[i] = in.nextInt();
		}

		System.out.println("Enter the kth element");
		int kth = in.nextInt();
		System.out.println(largestKthNumber(nums, kth));
		in.close();
	}

}
