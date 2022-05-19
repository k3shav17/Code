package com.techiedelight;

import java.util.Arrays;
import java.util.Random;

//Shuffle an array using Fisher–Yates shuffle algorithm
public class ShuffleArray {

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void shuffled(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			Random rand = new Random();
			int j = rand.nextInt(i + 1);

			swap(arr, i, j);
		}
	}

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 4, 5, 6 };

		shuffled(A);
		System.out.println(Arrays.toString(A));
	}
}
