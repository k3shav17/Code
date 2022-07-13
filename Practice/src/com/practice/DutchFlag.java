package com.practice;

import java.util.Arrays;

public class DutchFlag {

	public int[] sortedFlag(int[] flag) {

		int low = 0, high = flag.length - 1;
		int mid = 0;

		while (mid <= high) {

			switch (flag[mid]) {
			case 0:
				swap(flag, low, mid);
				low++;
				mid++;
				break;

			case 1:
				mid++;
				break;

			case 2:
				swap(flag, mid, high);
				high--;
				break;
			}
		}

		return flag;
	}

	public static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		return arr;
	}

	public static void main(String[] args) {

		int[] flag = { 0, 1, 2, 0, 1 };
		DutchFlag df = new DutchFlag();
		System.out.println(Arrays.toString(df.sortedFlag(flag)));
	}
}
