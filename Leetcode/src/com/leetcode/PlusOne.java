package com.leetcode;

import java.util.Scanner;

/*You are given a large integer represented as an integer array digits, 
 * where each digits[i] is the ith digit of the integer. 
 * The digits are ordered from most significant to least significant in left-to-right order. 
 * The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].*/

public class PlusOne {

	public static void addingPlusOne(int[] digits) {

		String arrStr = "";
		int[] convArr;

		for (int i = 0; i < digits.length; i++) {
			arrStr += digits[i];
		}

		int converted = Integer.parseInt(arrStr);

		converted++;

		arrStr = converted + "";
		convArr = new int[arrStr.length()];
		for (int i = 0; i < arrStr.length(); i++) {

			convArr[i] = Integer.parseInt(arrStr.charAt(i) + "");
		}

		for (int i = 0; i < convArr.length; i++) {
			System.out.print(convArr[i] + " ");
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		System.out.println("Enter the elements in to array");

		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {

			array[i] = in.nextInt();
		}

		PlusOne.addingPlusOne(array);
		in.close();

	}
}
