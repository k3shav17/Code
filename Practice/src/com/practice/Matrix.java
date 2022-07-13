package com.practice;

public class Matrix {

	public int quotient(int[][] matrix, int[] index) {

		int sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			sum += matrix[row][row];
		}

		int dividend = withoutRec(matrix, index);
		return sum / dividend;
	}

//	public int singleDigitDivider(int divisor) {
//
//		if (divisor < 10)
//			return divisor;
//
//		return singleDigitDivider(divisor % 10 + singleDigitDivider(divisor / 10));
//	}

	public int withoutRec(int[][] matrix, int[] index) {

		int divisor = matrix[index[0]][index[1]];

		if (divisor < 10)
			return divisor;

		int sum = 0;
		while (divisor > 0 || sum > 9) {

			if (divisor == 0) {
				divisor = sum;
				sum = 0;
			}

			sum = sum + divisor % 10;
			divisor = divisor / 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		int[][] matrix = { { 454, 55, 531, 14 }, { 78, 326, 104, 989 }, { 23447, 174, 87, 845 }, { 25, 81, 53, 11 } };
		int index[] = { 3, 1 };

		Matrix one = new Matrix();
		System.out.println(one.quotient(matrix, index));
	}
}
