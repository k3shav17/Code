package com.leetcode;

import java.util.Scanner;

//Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.
//
//Example 1:
//
//Input:
//N = 6, X = 16
//Arr[] = {1, 4, 45, 6, 10, 8}
//Output: Yes
//Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
//Example 2:
//
//Input:
//N = 5, X = 10
//Arr[] = {1, 2, 4, 3, 6}
//Output: Yes
//Explanation: Arr[2] + Arr[4] = 4 + 6 = 10
public class KeyPair {

	public static String sumOfPairs(int target, int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i] + arr[j] == target) {
					return "Yes";
				}
			}
		}
		return "No";
	}
	public static void main(String[] args) {
		
		System.out.println("enter the size of the array");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		System.out.println("enter the elements into the array");
	
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			
			arr[i] = in.nextInt();
		}
		
		System.out.println("enter the target value");
		int target = in.nextInt();
		
		System.out.println(sumOfPairs(target, arr));
		in.close();
	}
}
