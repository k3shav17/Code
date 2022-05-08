package com.dailybyte;

import java.util.Scanner;

/*Given an MxN matrix, which is sorted in decreasing order (row-wise and column-wise), return the total number of negative values in the array.

Ex: Given the following matrix…

matrix = [
  [3, -1],
  [2, -2]
], return 2 (-1 and -2 are negative).

Ex: Given the following matrix…

matrix = [
  [4, 3],
  [2, 1]
], return 0.*/
public class NegativeCount {

	public static int negatives(int[][] matrix, int row, int col) {

		int count = 0;
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				if (matrix[r][c] < 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		System.out.println("enter the no of rows and columns");
		Scanner in = new Scanner(System.in);

		int row = in.nextInt();
		int col = in.nextInt();

		int[][] mat = new int[row][col];

		System.out.println("enter the elements into the matrix");

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				mat[r][c] = in.nextInt();
			}
		}
		System.out.println(negatives(mat, row, col));
		in.close();
	}
}
