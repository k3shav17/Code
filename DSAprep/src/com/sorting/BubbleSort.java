package com.sorting;

import java.util.Scanner;

/* Bubble sort is a sorting algorithm that compares two adjacent 
 * element and swaps them until they are not in the intended order.
 * 
 * 
 * Time complexity 
 * 		Best case O(n)
 * 		Worst case O(n^2)
 * 		Average case O(n^2)
 * 
 * Space complexity O(1)
 */
public class BubbleSort {

	public static void sorting(int[] list) {

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length - 1; j++) {
				if (list[j] > list[j + 1]) {

					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
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
