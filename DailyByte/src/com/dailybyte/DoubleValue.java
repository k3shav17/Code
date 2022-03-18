package com.dailybyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given an integer array, nums, return true if for any value within nums its double also exists within the array.

Ex: Given the following nums…

nums = [4, 3, 9, 8], return true (4 and 8 both appear in nums).

Ex: Given the following nums…

nums = [9, 2, 3, 5], return false.*/

public class DoubleValue {

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		boolean flag = false;

		List<Integer> nums = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			nums.add(in.nextInt());
		}

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (nums.get(i) * 2 == nums.get(j)) {
					flag = true;
					break;
				}
			}
		}

		System.out.println(flag);
		in.close();

	}
}
