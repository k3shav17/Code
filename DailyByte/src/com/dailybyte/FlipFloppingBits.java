package com.dailybyte;

import java.util.Scanner;

/*
 * Given a positive integer N, return whether or not it has alternating bit values.
 * Ex: Given the following value for N…
 * N = 5, return true
 * 5 in binary is 101 which alternates bit values between 0 and 1.
 * Ex: Given the following value for N…
 * N = 8, return false
 * 8 in binary is 1000 which does not alternate bit values between 0 and 1.
*/

public class FlipFloppingBits {

	public static boolean flipFlop(int number) {

		int[] binary = new int[32];
		boolean flag = false;
		int index = 0;
		while(number > 0) {
			binary[index++] = number % 2;
			number = number / 2;
		}
		
		for (int i = 0; i < index; i++) {
			if ((binary[i] == binary[i + 2]) && binary[i + 1] != binary[i]) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		System.out.println(flipFlop(number));
		in.close();
	}
}
