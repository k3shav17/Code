package com.dailybyte;

import java.util.Scanner;

/*
 * x = 2, y = 4, return 2.
 * 2 in binary is 0 0 1 0
 * 4 in binary is 0 1 0 0
 * therefore the number of positions in which the bits differ is two.
*/

public class HammingDistance {

	public static void findingHammingDist(int first, int second) {

		int f = 0, s = 0;
		int[] firstBin = new int[32];
		int[] secondBin = new int[32];
		String fi = "";
		String se = "";
		int count = 0;

		while (first > 0) {
			firstBin[f++] = first % 2;
			fi += first % 2;
			first = first / 2;
		}

		while (second > 0) {
			secondBin[s++] = second % 2;
			se += second % 2;
			second = second / 2;
		}

		if (fi.length() != se.length()) {

			if (fi.length() < se.length()) {
				fi += "0";
			}
			for (int i = fi.length() - 1; i >= 0; i--) {
				System.out.print(fi.charAt(i) + " ");
			}
			System.out.println();
			for (int i = se.length() - 1; i >= 0; i--) {
				System.out.print(se.charAt(i) + " ");

			}
			for (int i = fi.length() - 1; i >= 0; i--) {
				for (int j = i; j < i; j++) {
					if (fi.charAt(i) == se.charAt(j)) {
						count++;
					}
				}
			}
			System.out.println("This count is from if statement " + count);

		} else {
			for (int i = fi.length() - 1; i >= 0; i--) {
				System.out.print(fi.charAt(i) + " ");
			}
			System.out.println();
			for (int i = se.length() - 1; i >= 0; i--) {
				System.out.print(se.charAt(i) + " ");
			}

			for (int i = 0; i < fi.length(); i++) {
				for (int j = i; j < i; j++) {
					if (fi.charAt(i) != se.charAt(j)) {
						count++;
					}
				}
			}
			System.out.println("This count is from else statement " + count);

		}

	}

	public static void main(String[] args) {

		System.out.println("Enter two numbers to know the hamming distance");

		Scanner in = new Scanner(System.in);
		int first = in.nextInt();
		int second = in.nextInt();

		findingHammingDist(first, second);
		in.close();

	}

}
