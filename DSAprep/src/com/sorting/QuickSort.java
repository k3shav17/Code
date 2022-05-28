package com.sorting;

import java.util.Arrays;

/* Quicksort is a sorting algorithm based on the divide and conquer aprroach
 * 
 * An array is divided into subarrays by selecting a pivot element (element selected from the array).
 * 
 * While dividing the array, 
 * the pivot element should be positioned in such a way that 
 * elements less than pivot are kept on the left side and elements greater than pivot are on the right side of the pivot.
 * 
 * The left and right subarrays are also divided using the same approach.
 * This process continues until each subarray contains a single element.
 *  
 *  At this point, elements are already sorted. 
 *  Finally, elements are combined to form a sorted array.
 * 
 */
public class QuickSort {

	public static void sorting(int[] list, int low, int high) {

		if (low >= high) {
			return;
		}

		int start = low, end = high;
		int mid = start + (end - start) / 2;
		int pivot = list[mid];

		while (start <= end) {

			while (list[start] < pivot) {
				start++;
			}

			while (list[end] > pivot) {
				end--;
			}

			if (start <= end) {
				int temp = list[start];
				list[start] = list[end];
				list[end] = temp;
				start++;
				end--;
			}

			sorting(list, low, end);
			sorting(list, high, start);
		}

	}

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
		sorting(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));
	}
}
