package com.sde;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Given an unsorted array A of size N that contains only non-negative integers, 
 * find a continuous sub-array which adds to a given number S.
 * In case of multiple subarrays, return the subarray which comes first on moving from left to right.
 * 
Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
 

Example 2:

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.*/

public class ContinuousSubarray {

	public static void sumOfSubarray(List<Integer> list, int target) {

		for (int i = 0; i < list.size(); i++) {
			int sum = list.get(i);

			for (int j = i + 1; j < list.size(); j++) {
				sum = sum + list.get(j);

				if (sum == target) {
					System.out.println(i + 1);
					System.out.println(j + 1);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("enter the elements into the array, click x when you are done.");

		Scanner in = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();

		while (true) {
			String element = in.nextLine();

			if (element.equalsIgnoreCase("x")) {
				break;
			} else
				list.add(Integer.parseInt(element));
		}

		System.out.println("enter the target sum");
		int target = in.nextInt();

		sumOfSubarray(list, target);
		in.close();
	}
}
