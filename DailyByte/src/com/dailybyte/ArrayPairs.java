package com.dailybyte;

/*You are given an integer array, nums, that contains 2N integers. 
 * Return the maximum sum you can create by pairing integers together and summing the minimum values in each of the pairs.

Ex: Given the following nums…

nums = [1, 3, 2, 4], return 4 (min(1, 2) + min(3, 4) = 4).

Ex: Given the following nums…

nums = [2, 4, 2, 8, 4, 3], return 9.*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayPairs {

	public static void maxSumOfPairs(List<Integer> nums) {

		Collections.sort(nums);

		System.out.println(nums);
		int sum = 0;

		for (int i = 0; i < nums.size() - 1; i = i + 2) {
			sum = sum + min(nums.get(i), nums.get(i + 1));
		}
		System.out.println(sum);
	}

	public static int min(int n1, int n2) {
		if (n1 < n2) {
			return n1;
		}
		return n2;
	}

	public static void main(String[] args) {
		System.out.println("Enter the size of the array, the size should be 2N");

		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		List<Integer> nums = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			nums.add(in.nextInt());
		}

		if (nums.size() > 2)
			maxSumOfPairs(nums);
		else System.out.println("size should be multiple of 2.");
		in.close();
		System.exit(0);
	}
}
