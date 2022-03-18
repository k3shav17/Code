package com.dailybyte;

import java.util.Scanner;

/*Given a non-negative integer, num, repeatedly add all its digits until it has a single digit remaining and return it.

Ex: Given the following num...

num = 123, return 6 (1 + 2 + 3 = 6)

Ex: Given the following num...

num = 8353, return 1 (8 + 3 + 5 + 3 = 19 = 1 + 9 = 10 = 1 + 0 = 1).*/
public class FinalDigit {

	public static int reducingToOne(int number) {
		int temp = number;
		int anotherTemp = 0, sum = 0;
		while (temp >= 1) {
			anotherTemp = temp % 10;
			sum = sum + anotherTemp;
			temp = temp / 10;
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

		int temp = number;
		int anotherTemp = 0, sum = 0;
		while (temp >= 1) {
			anotherTemp = temp % 10;
			sum = sum + anotherTemp;
			temp = temp / 10;
		}

		if (FinalDigit.reducingToOne(sum) >= 10) {
			sum = FinalDigit.reducingToOne(FinalDigit.reducingToOne(sum));
			System.out.println(sum);
		} else {

			System.out.println(sum);
		}

		in.close();
	}

}
