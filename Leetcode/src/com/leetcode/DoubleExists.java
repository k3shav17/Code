package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

More formally check if there exists two indices i and j such that :

    i != j
    0 <= i, j < arr.length
    arr[i] == 2 * arr[j]
*/
public class DoubleExists {

	public static boolean isDouble(List<Integer> nums) {

		boolean flag = false;

		List<Integer> withOutZero = new ArrayList<Integer>();

		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) > 0 || nums.get(i) < 0) {
				withOutZero.add(nums.get(i));
			}
		}

		if (withOutZero.size() == 0) {
			flag = true;
		}

		for (int i = 0; i < withOutZero.size(); i++) {
			for (int j = 0; j < withOutZero.size(); j++) {
				if (2 * withOutZero.get(i) == withOutZero.get(j)) {
					flag = true;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {

		System.out.println("enter the size of the array");
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		List<Integer> nums = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			nums.add(in.nextInt());
		}

		System.out.println(isDouble(nums));
		in.close();

	}
}
