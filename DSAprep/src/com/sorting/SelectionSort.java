package com.sorting;

import java.util.Scanner;

/* Selection sort is a sorting algorithm that selects the smallest element
 * from an unsorted list in each iteration and places that element at the 
 * beginning of the unsorted list.
 * 
 * Time complexity
 * 		Best case O(n^2)
 * 		Worst case O(n^2)
 * 		Average case O(n^2)
 * 
 * Space complexity O(1)
 */
public class SelectionSort {

	public static void sorting(int[] list) {

		for (int i = 0; i < list.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < list[min]) {
					min = j;
				}
			}

			int temp = list[i];
			list[i] = list[min];
			list[min] = temp;
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
