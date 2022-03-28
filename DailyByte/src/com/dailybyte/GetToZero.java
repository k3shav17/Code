package com.dailybyte;

import java.util.Scanner;

/*Given a non-negative integer, num, return the number of operations it takes to reduce it to zero. 
 * If num is even, divide it by two. If num is odd, subtract one from it. 
 * Continue this process until num is zero.

Ex: Given the following num…

num = 5, return 4 (subtract 1, divide by 2, divide by 2, subtract 1).

Ex: Given the following num…

num = 16, return 5.*/

public class GetToZero {

	public static int reducingToZero(int number) {

		int count = 0;

		while (number > 0) {
			if (number % 2 == 0) {
				number = number / 2;
			} else
				number -= 1;
			count ++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);

		int number = in.nextInt();

		System.out.println(GetToZero.reducingToZero(number));
		in.close();
	}
}
