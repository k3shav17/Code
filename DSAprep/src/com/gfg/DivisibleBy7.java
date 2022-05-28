package com.gfg;

import java.util.Scanner;

/*Given an n-digit large number in form of string, check whether it is divisible by 7 or not. Print 1 if divisible by 7, otherwise 0.
Example 1:

Input: num = "8955795758"
Output: 1
Explanation: 8955795758 is divisible
by 7.
Example 2:

Input: num = "1000"
Output: 0
Explanation: 1000 is not divisible
by 7.*/

public class DivisibleBy7 {

	public static int isDivisible(Long number) {

		if (number % 7 == 0)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner in = new Scanner(System.in);
		String number = in.nextLine();

		Long num = Long.parseLong(number);
		System.out.println(isDivisible(num));
		in.close();
	}
}
