package com.dailybyte;

import java.util.Scanner;

public class CountingPrimes {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
		int prime = in.nextInt();
		if (prime >= 2 && prime <= 3) {
			System.out.print(2 + " is the only prime number less than " + prime);
		} else if (prime > 3 && prime <= 5) {
			System.out.print(2 + " ");
			System.out.print(3 + " ");
			System.out.print("are the only prime numbers that are less than " + prime);
		} else if (prime > 5 && prime <= 7) {
			System.out.print(2 + " ");
			System.out.print(3 + " ");
			System.out.print(5 + " ");
			System.out.print("are the only prime numbers that are less than " + prime);
		} else {
			System.out.print(2 + " ");
			System.out.print(3 + " ");
			System.out.print(5 + " ");
			System.out.print(7 + " ");
			for (int i = 2; i < prime; i++) {
				if (i % 2 != 0) {
					if (i % 3 != 0 && i % 5 != 0 && (i % 7 != 0)) {
						System.out.print(i + " ");
					}
				}
			}
			System.out.print("are the only numbers that are less than " + prime);
			in.close();
		}
	}
}
