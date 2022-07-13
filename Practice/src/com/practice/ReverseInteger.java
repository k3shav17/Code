package com.practice;

public class ReverseInteger {

	public int reversedInteger(int number) {

		int temp = number;
		int reverse = 0;

		while (number > 0) {

			temp = number % 10;
			reverse = reverse * 10 + temp;
			if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
				return -1;
			}
			number = number / 10;
		}
		return reverse;
	}

	public static void main(String[] args) {

		int number = 489;

		ReverseInteger ri = new ReverseInteger();
		System.out.println(ri.reversedInteger(number));
	}
}
