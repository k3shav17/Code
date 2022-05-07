package com.leetcode;

import java.util.Scanner;

//Given an array with both +ive and -ive integers, return a pair with highest product.
//
//Examples :  
//
//Input: arr[] = {1, 4, 3, 6, 7, 0}  
//Output: {6,7}  
//
//Input: arr[] = {-1, -3, -4, 2, 0, -5} 
//Output: {-4,-5}
public class MaxProduct {

	public static void highestPair(int[] arr) {

		int[] pair = new int[arr.length];

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (Math.abs(arr[i] * arr[j]) > Math.abs(max)) {
					max = Math.abs(arr[i] * arr[j]);
					pair[0] = arr[i];
					pair[1] = arr[j];
				}
			}
		}

		for (int i = 0; i < 2; i++) {
			System.out.print(pair[i] + " ");
		}
	}

	public static void main(String[] args) {

		System.out.println("enter the size of the array");
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}

		highestPair(arr);

		in.close();
	}
}
