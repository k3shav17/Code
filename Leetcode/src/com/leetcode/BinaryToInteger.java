package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given head which is a reference node to a singly-linked list.
 * The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
 * Return the decimal value of the number in the linked list.

Example 1:

Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10

Example 2:

Input: head = [0]
Output: 0
*/
public class BinaryToInteger {

	public static int binToInt(List<Integer> list) {

		int sum = 0;

		for (int i = 0; i < list.size(); i++) {
			sum = (int) (sum + Math.pow(2, i) * list.get(i));
		}

		return sum;
	}

	public static void main(String[] args) {

		System.out.println("enter the elements into the array, when done click x ");

		Scanner in = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();

		while (true) {

			String element = in.next();

			if (element.equalsIgnoreCase("x")) {
				break;
			} else
				list.add(Integer.parseInt(element));
		}

		System.out.println(binToInt(list));
		in.close();
	}
}
