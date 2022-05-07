package com.dailybyte;

import java.util.Scanner;

/*Given positive an integer num, return whether or not it is a perfect square.

Ex: Given the following num...

num = 9, return true.

Ex: Given the following num...
num = 18, return false. */
public class PerfectSquare {

	public static boolean isPerfect(int number) {

		for (int i = 1; i <=number; i++) {
			if (i * i == number) {
				return true;
			}
		}

		return false;
	}
	public static void main(String[] args) {

		System.out.println("enter the number you want to find if it is perfect square or not");
		Scanner in = new Scanner(System.in);

		int number = in.nextInt();

		System.out.println(isPerfect(number));
		in.close();
	}
}
