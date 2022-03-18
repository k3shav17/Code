package com.dailybyte;

/*nums = [1, 2, 3, 4, 4, 5], return true.
Ex: Given the following array nums…

nums = [7, 6, 3], return true.
Ex: Given the following array nums…

nums = [8, 4, 6], return false.*/

import java.util.ArrayList;
import java.util.Scanner;

public class IsMonotonic {

	public static boolean isMonotonous(ArrayList<Integer> nums) {

		int inc = 0, dec = 0;
		for (int i = 0; i < nums.size() - 1; i++) {
			if (nums.get(i) <= nums.get(i + 1)) {
				inc++;
			} else if (nums.get(i) >= nums.get(i + 1)) {
				dec++;
			}
		}
		if (dec == nums.size() || inc == nums.size())
			return true;
		return false;
	}

	public static void main(String[] args) {

		System.out.println("Enter size");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println("Enter list of numbers");

		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			nums.add(in.nextInt());
		}
		System.out.println(isMonotonous(nums));
		in.close();
	}

}
