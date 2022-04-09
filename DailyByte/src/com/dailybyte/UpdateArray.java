package com.dailybyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given an integer array, nums, replace each element with the largest value that occurs to the right of it and return the array. 
Note: The rightmost element should be replaced with -1. 

Ex: Given the following nums…

nums = [5, 2, 3], return [3, 3, -1].
Ex: Given the following nums…

nums = [10, 2, 5, 8, 9], return [9,9,9,9,-1].
*/
public class UpdateArray {

	public static List<Integer> updated(List<Integer> nums) {

		int max = nums.get(0);

		List<Integer> newNums = new ArrayList<Integer>();

		for (int i = 0; i < nums.size(); i++) {

			for (int j = i; j < nums.size(); j++) {
				
				if (nums.get(j) > max) {
					max = nums.get(j);
				} else {
					max = -1;
				}
			}

			newNums.add(max);
		}

		return newNums;
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of the list");
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		System.out.println("Enter the elements in to the array");

		List<Integer> nums = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			nums.add(in.nextInt());
		}

		System.out.println(updated(nums));
		in.close();
	}
}
