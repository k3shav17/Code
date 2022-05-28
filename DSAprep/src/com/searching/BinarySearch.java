package com.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Binary search is searching algorith for finding an element's position in a sorted array.
 * In this approach, the element is always searched in the middle of a portion of an array.
 * 
 * Binary search can be implemented in two ways
 * Iterative method
 * Recursive method
 * 
 * Time complexities
 * 		Best case O(1)
 * 		Average case O(log n)
 * 		Worst case O(log n)
 * 
 * Space complexity O(1)
 * 
 */
public class BinarySearch {

	public static int searching(List<Integer> list, int target) {

		int low = 0, high = list.size() - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (target == list.get(mid)) {
				return mid;
			} else if (list.get(mid) < target) {
				low = mid + 1;
			} else
				high = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {

		System.out.println("enter the elements in to the list, when you are done click X");

		List<Integer> list = new ArrayList<Integer>();

		Scanner in = new Scanner(System.in);

		while (true) {
			String element = in.next();

			if (element.equalsIgnoreCase("x")) {
				break;
			} else
				list.add(Integer.parseInt(element));
		}

		System.out.println("enter the target element, you want to search in the list");
		int target = in.nextInt();
		System.out.println(searching(list, target));
		in.close();
	}
}
