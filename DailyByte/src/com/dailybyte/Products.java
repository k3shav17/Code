package com.dailybyte;

import java.util.Scanner;

public class Products {

	public static void productReturns(int[] nums) {

		int[] returns = new int[nums.length];

		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = 0; j < nums.length - 1; j++) {
				int product = 1;
				if (i != j) {
					product *= nums[j] * nums[j + 1];
					returns[j] = product;
				}
			}
		}
		for (int i = 0; i < returns.length; i++) {
			System.out.println(returns[i]);
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] nums = new int[size];
		System.out.println("enter the elements of the array");
		for (int i = 0; i < size; i++) {
			nums[i] = in.nextInt();
		}

		Products.productReturns(nums);
		in.close();
	}

}
