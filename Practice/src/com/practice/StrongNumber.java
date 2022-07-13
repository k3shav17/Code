package com.practice;

public class StrongNumber {

	public static boolean isStrong(int number) {

		int sum = 0;
		int temp = number, validate = number;
		while (number > 0) {
			temp = number % 10;
			sum += fact(temp);
			number = number / 10;
		}
		return sum == validate;
	}

	public static int fact(int temp) {
		if (temp == 1) return 1;
		return temp * fact(temp - 1);
	}

	public static void main(String[] args) {
		int number = 145;
		System.out.println(isStrong(number));
	}
}
