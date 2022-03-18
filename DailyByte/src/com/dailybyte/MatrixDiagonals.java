package com.dailybyte;

/*Given a two-dimensional NxN integer array, matrix, return the sum of all values along its two diagonals.
Note: If a value appears in both diagonals it should only be added to your sum once.

Ex: Given the following matrix…

matrix = [
  [1, 2],
  [2, 1]
], return 6 (1 + 1 + 2 + 2).

Ex: Given the following matrix…

matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
], return 25 (5 is only added to the sum once).

*/
public class MatrixDiagonals {

	public static int sumOfDiagonals(int[][] twoDim) {

		int sum = 0;

		if (twoDim.length <= 2) {
			sum = twoDim[0][0];
			for (int i = 1; i < twoDim.length; i++) {
				for (int j = 2; j <= twoDim.length; j++) {

					sum += twoDim[i][j - i];
				}
			}

			for (int i = 0; i < twoDim.length - 1; i++) {
				for (int j = twoDim.length - 1; j >= 0; j--) {

					sum += twoDim[i][j];
					i++;
				}
			}

			return sum;
		}

		sum = twoDim[0][0];
		for (int i = 1; i < twoDim.length; i++) {
			for (int j = 3; j <= twoDim[i].length; j++) {

				sum += twoDim[i][j - i];
			}
		}

		for (int i = 0; i < twoDim.length - 1; i++) {
			for (int j = twoDim[i].length - 1; j >= 0; j--) {
				sum += twoDim[i][j];
				i++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] twoDim = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
//		int[][] twoDim = { { 1, 2 }, { 1, 2 } };

		for (int i = 0; i < twoDim.length; i++) {
			for (int j = 0; j < twoDim[i].length; j++) {
				{
					System.out.print(twoDim[i][j] + " ");

				}

			}
			System.out.println();
		}
		System.out.println(MatrixDiagonals.sumOfDiagonals(twoDim));
	}
}
