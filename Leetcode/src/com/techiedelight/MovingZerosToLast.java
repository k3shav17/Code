package com.techiedelight;

import java.util.LinkedList;
import java.util.List;

/*Given an integer array, move all zeros present in it to the end. 
 * The solution should maintain the relative order of items in the array and should not use constant space.
For example,

Input:  { 6, 0, 8, 2, 3, 0, 4, 0, 1 }
 
Output: { 6, 8, 2, 3, 4, 1, 0, 0, 0 }*/

public class MovingZerosToLast {

	public static void main(String[] args) {

		int[] array = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };

		List<Integer> moving = new LinkedList<>();

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				moving.add(array[i]);
			}
		}

		for (int i = moving.size() - 1; i < array.length; i++) {
			moving.add(0);
		}

		System.out.println(moving);
	}

}
