package com.dailybyte;

import java.util.ArrayList;
/*Given an integer array, nums, return true if there are three consecutive odd values within nums, otherwise, return false.

Ex: Given the following nums…

nums = [1, 2, 3, 4, 5], return false.

Ex: Given the following nums…

nums = [1, 3, 4, 2, 3, 9, 15], return true.*/
import java.util.List;
import java.util.Scanner;

public class ThreeInRow {

	public boolean isThreeOdds(List<Integer> nums) {

		boolean flag = false;
		for (int i = 0; i < nums.size() - 2; i++) {

			if ((nums.get(i) % 2 != 0) && (nums.get(i + 1) % 2 != 0)) {
				if (nums.get(i + 2) % 2 != 0) {
					flag = true;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		List<Integer> nums = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			nums.add(in.nextInt());
		}
		ThreeInRow three = new ThreeInRow();
		System.out.println(three.isThreeOdds(nums));
		in.close();
	}
}
