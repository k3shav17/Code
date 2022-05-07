package com.sde;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. Expected time complexity is O(Logn) 

Examples: 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
  Output: 4 // x (or 2) occurs 4 times in arr[]

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
  Output: 1 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
  Output: 2 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
  Output: -1 // 4 doesn't occur in arr[] 
*/
public class NumberOfOccurances {

	public static int repetitionOfX(List<Integer> nums, int x) {

		int count = 0;
		for (int i = 0; i < nums.size(); i++) {

			if (nums.get(i) == x) {
				count++;
			}
		}
		if (count == 0) {
			return -1;
		}
		return count;
	}

	public static void main(String[] args) {

		System.out.println("enter the elements into the array, click x when you are done.");

		Scanner in = new Scanner(System.in);

		List<Integer> nums = new ArrayList<Integer>();

		while (true) {

			String element = in.nextLine();

			if (element.equalsIgnoreCase("x")) {
				break;
			} else
				nums.add(Integer.parseInt(element));
		}

		System.out.println("enter the target number");
		int x = in.nextInt();

		System.out.println(repetitionOfX(nums, x));
		in.close();
	}
}
