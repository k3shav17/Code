package com.dailybyte;

/*Given an integer array, nums, return an array containing its running sum at every index.

Ex: Given the following nums…

nums = [1, 2, 3], return [1, 3, 6].

Ex: Given the following nums…

nums = [10], return [10].*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySum {

	public static List<Integer> summingArray(List<String> nums) {

		List<Integer> sum = new ArrayList<>();

		for (int i = 0; i < nums.size(); i++) {
			sum.add(Integer.parseInt(nums.get(i)));
		}

		if (nums.size() <= 1) {
			return sum;
		}

		for (int i = 1; i < nums.size(); i++) {
			int add = sum.get(i - 1) + sum.get(i);
			sum.set(i, add);
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println("Enter the values\nType exit when you are done!");

		Scanner in = new Scanner(System.in);

		List<String> nums = new ArrayList<>();

		while (true) {
			String input = in.nextLine();

			if (input.equals("exit")) {
				break;
			} else
				nums.add(input);
		}
		System.out.println(ArraySum.summingArray(nums));
		in.close();
	}
}
