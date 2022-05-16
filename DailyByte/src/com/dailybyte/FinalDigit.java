package com.dailybyte;

import java.util.Scanner;

/*
 * Given a non-negative integer, num, repeatedly add all its digits until it has a single digit remaining and return it.
 * Ex: Given the following num...
 * num = 123, return 6 (1 + 2 + 3 = 6)
 * Ex: Given the following num...
 * num = 8353, return 1 (8 + 3 + 5 + 3 = 19 = 1 + 9 = 10 = 1 + 0 = 1).
 * */
public class FinalDigit {

	public static int reducing(int number) {
		int temp = number;
		int sum = 0;

		while (temp > 0) {
			temp = number % 10;
			sum = sum + temp;
			number = number / 10;
		}
		if (sum > 9) {
			System.out.println(sum);
			return reducing(sum);
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println("Enter the number, which is greater than 0");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();

		if (number == 1) {
			System.out.println(number);
			System.exit(0);
		}

		System.out.println(reducing(number));
		in.close();
	}
}
