package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

/*Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9*/
public class MissingNumber {

	public static int wanted(int[] arr) {
		
		Arrays.sort(arr);
		int missing = 0;
		for (int i = 1; i <= arr.length; i++) {
			
			if (arr[i - 1] != i) {
				missing = i;
				break;
			}
		}
		
		return missing;
	}
	public static void main(String[] args) {
		
		System.out.println("enter the size of the array");
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(wanted(arr));
		in.close();
	}
}
