package com.dailybyte;

import java.util.Scanner;

/*Given an integer, n, return the difference between the product and sum of its digits.

Ex: Given the following n…

n = 321, return 0 ((3 * 2 * 1) - (3 + 2 + 1).

Ex: Given the following n…

n = 56, return 19.*/

public class DigitArithmetic {

	public static int diffOfProductAndSum(int digit) {

		int sum = 0, product = 1;
		int temp = digit;

		while (temp > 1) {

			temp = digit % 10;
			sum = sum + temp;
			product = product * temp;

			digit = digit / 10;
			if (digit == 0) {
				break;
			}
		}

		return product - sum;
	}

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		int digit = in.nextInt();

		System.out.println(DigitArithmetic.diffOfProductAndSum(digit));
		in.close();

	}
}
