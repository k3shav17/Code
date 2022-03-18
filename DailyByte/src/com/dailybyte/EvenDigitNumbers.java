package com.dailybyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given an integer array, nums, return the total number of integers within nums that have an even number of digits.

Ex: Given the following nums…

nums = [1, 12, 123], return 1 (12 is the only integer with an even number of digits).

Ex: Given the following nums…

nums = [1, 32, 3492, 23], return 3*/

public class EvenDigitNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int count = 0;
		List<String> nums = new ArrayList<>();
		in.nextLine();
		for (int i = 0; i < size; i++) {
			nums.add(in.nextLine());
		}

		for (int i = 0; i < size; i++) {
			if (nums.get(i).length() != 1) {

				if (nums.get(i).length() % 2 == 0) {
					count++;
				}
			}
		}

		System.out.println(count);
		in.close();
	}
}
