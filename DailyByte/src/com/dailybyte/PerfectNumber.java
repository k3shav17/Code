package com.dailybyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Given an integer, num, return whether or not it is a perfect number.
 * Note: A perfect number is a positive number that is equal to the sum of its positive divisors excluding itself.

Ex: Given the following num…

num = 6, return true (1 + 2 + 3 = 6).

Ex: Given the following num…

num = 7, return false.*/

public class PerfectNumber {

	public static boolean perfectOrNot(List<Integer> divisors, int number) {

		int sum = 0;

		for (int i = 0; i < divisors.size(); i++) {
			sum = sum + divisors.get(i);
		}

		if (sum == number) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		System.out.println("Enter a number to know whether it is a perfect number or not.");

		Scanner in = new Scanner(System.in);

		int number = in.nextInt();

		List<Integer> divisors = new ArrayList<>();
		int i = 1;
		int sum = 0;
		while (i < number) {

			if (number % i == 0) {
				divisors.add(i);
				sum = sum + i;
			}

			i++;
		}

		System.out.println(divisors);
		if (sum == number) {
			System.out.println(true);
		} else
			System.out.println(false);
		System.out.println(sum);
//		System.out.println(perfectOrNot(divisors, number));
		in.close();
	}

}
