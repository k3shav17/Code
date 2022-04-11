package com.dailybyte;

import java.util.Scanner;

/*Given a k-digit integer, num, return whether or not the number if magical.
Note: A magical numbers is a number in which the the sum of all its digits raised to the kth power sum to the number itself. 

Ex: Given the following num…

num = 153, return true (1^3 + 5^3 + 3^3 = 153).
Ex: Given the following num…

num = 38, return false.*/

public class MagicalNumber {

	public static boolean isMagical(int number) {

		int temp = number, anotherTemp = number;
		int cubed = 1, sum = 0;

		while (temp > 0) {
			temp = number % 10;

			cubed = temp * temp * temp;
			sum = sum + cubed;

			number = number / 10;
		}

		if (sum == anotherTemp)
			return true;
		return false;

	}

	public static void main(String[] args) {
		System.out.println("Enter the number");

		Scanner in = new Scanner(System.in);
		int number = in.nextInt();

		System.out.println(isMagical(number));
		in.close();
	}
}
