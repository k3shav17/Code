package com.dailybyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given an array of integers, nums, sorted in ascending order, return the element that occurs more than one fourth of the time. 
Note: If no element appears more than a fourth of the time, return -1. 

Ex: Given the following nums…

nums = [1, 2, 2, 3, 4], return 2.
Ex: Given the following nums…

nums = [1, 2, 3, 4], return -1.*/

public class OneFourth {

	public static int repeatedElement(List<Integer> nums) {

		int repeated = 0;

		for (int i = 0; i < nums.size(); i++) {
			int count = 0;
			for (int j = i + 1; j < nums.size(); j++) {
				if (nums.get(i) == nums.get(j)) {
					count++;
				}
			}
			if (count > 0) {
				repeated = i;
			}
		}
		if (repeated == 0) {
			return -1;
		}
		return nums.get(repeated);
	}

	public static void main(String[] args) {
		System.out.println("Enter the elements into the array, once done enter 'x'");

		List<Integer> nums = new ArrayList<Integer>();

		Scanner in = new Scanner(System.in);

		while (true) {

			String num = in.next();

			if (num.equals("x")) {
				break;
			} else
				nums.add(Integer.parseInt(num));
		}
		System.out.println(repeatedElement(nums));
		in.close();
	}
}
