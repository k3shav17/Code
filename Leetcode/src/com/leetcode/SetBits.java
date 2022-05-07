package com.leetcode;

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
public class SetBits {

	public static int countingOnes(int number) {

		int count = 0;
		List<String> binaries = new ArrayList<>();

		for (int i = 1; i <= number; i++) {

			String binary = "";
			int temp = i;

			while (temp > 0) {

				binary += temp % 2;
				temp = temp / 2;
			}
			binaries.add(binary);
		}

		for (int i = 0; i < binaries.size(); i++) {

			for (int j = 0; j < binaries.get(i).length(); j++) {
				if (binaries.get(i).charAt(j) == '1') {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		System.out.println("enter a number till which you wants to know the ones in it");

		Scanner in = new Scanner(System.in);

		int number = in.nextInt();

		System.out.println(countingOnes(number));
		in.close();
	}
}
