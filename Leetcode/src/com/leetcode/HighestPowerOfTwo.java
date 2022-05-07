package com.leetcode;

import java.util.Scanner;

/*Given a number n, find the highest power of 2 that is smaller than or equal to n.

Examples : 

Input : n = 10
Output : 8

Input : n = 19
Output : 16

Input : n = 32
Output : 32*/
public class HighestPowerOfTwo {

	public static int powerOfTwo(int number) {

		int product = 1;

		for (int i = 1; i < number; i++) {

			if (product * 2 <= number) {
				product = product * 2;
			}
		}

		return product;
	}

	public static void main(String[] args) {

		System.out.println(
				"enter a number to know the number which is the power of that is less or equal to given number");

		Scanner in = new Scanner(System.in);
		int number = in.nextInt();

		System.out.println(powerOfTwo(number));
		in.close();
	}

}
