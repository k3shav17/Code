package com.gfg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given a positive integer n, count the total number of set bits in binary representation of all numbers from 1 to n. 

Examples: 

Input: n = 3
Output:  4

Input: n = 6
Output: 9

Input: n = 7
Output: 12

Input: n = 8
Output: 13*/
public class CountingSetBits {

	public static int setCount(int number) {

		List<String> count = new ArrayList<>();
		int ones = 0;

		for (int i = 1; i <= number; i++) {
			count.add(decToBin(i));
		}

		System.out.println(count);

		for (int i = 0; i < count.size(); i++) {
			for (int j = 0; j < count.get(i).length(); j++) {
				if (count.get(i).charAt(j) == '1') {
					ones++;
				}
			}
		}
		return ones;
	}

	public static String decToBin(int number) {

		String bits = "";
		int[] bin = new int[32];

		int index = 0;
		while (number > 0) {
			bin[index++] = number % 2;
			number = number / 2;
		}

		for (int i = index - 1; i >= 0; i--) {
			bits += bin[i];
		}
		return bits;
	}

	public static void main(String[] args) {

		System.out.println("enter a number");
		Scanner in = new Scanner(System.in);

		int number = in.nextInt();

		System.out.println(setCount(number));
		in.close();
	}
}
