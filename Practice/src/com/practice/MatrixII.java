package com.practice;

import java.util.Arrays;

public class MatrixII {

	public void allSteps(int[][] arr, int element) {

		int[] rc = findingX(arr, element);
		int s = sumOfRowCol(rc);
		int z = belowSRow(s + rc[0], rc[1], arr);
		int p = sumOfElements(z);
		System.out.println(Arrays.toString(findingX(arr, element)));
		System.out.println("Sum of row and column is " + s);
		System.out.println("Element below " + element + " is " + z);
		System.out.println("P is " + p);
	}

	public int[] findingX(int[][] arr, int element) {

		int[] indices = new int[2];
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr.length; j++)
				if (arr[i][j] == element) {
					indices[0] = i;
					indices[1] = j;
				}
		return indices;
	}

	public int sumOfRowCol(int[] rc) {
		return Arrays.stream(rc).sum();
	}

	public int belowSRow(int row, int col, int[][] arr) {

		if (row >= arr.length) {
			row = row - arr.length;
		}
		return arr[row][col];
	}

	public int sumOfElements(int num) {

		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {

//		int[][] arr = { { 454, 55, 521, 14 }, { 11, 329, 104, 989 }, { 23447, 174, 87, 845 }, { 25, 81, 53, 111 } };
		int[][] arr = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };
		int element = 66;

		MatrixII two = new MatrixII();
		two.allSteps(arr, element);
	}
}
