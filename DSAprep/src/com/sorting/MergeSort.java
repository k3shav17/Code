package com.sorting;

import java.util.Scanner;

/* Merge sort is one of the most popular sorting algorithms that is based
 * on the principle of Divide and Conquer 
 */
public class MergeSort {


	public static void sorting(int[] list) {
		
	}
	public static void main(String[] args) {

		System.out.println("enter the size of the array");

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] list = new int[size];

		System.out.println("enter the elements into the array");
		for (int i = 0; i < size; i++) {
			list[i] = in.nextInt();
		}
		sorting(list);
		in.close();
	}
}
