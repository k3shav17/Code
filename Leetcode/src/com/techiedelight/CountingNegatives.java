package com.techiedelight;

/*
 * Given an M × N matrix, which is row-wise and column-wise sorted, count the total number of negative elements present in it in linear time.
 * For example,
 * Input:
 
[ -7 -3 -1  3  5  ]
[ -3 -2  2  4  6  ]
[ -1  1  3  5  8  ]
[  3  4  7  8  9  ]
 
 Output:
 The total number of negative elements present is 6.
*/
public class CountingNegatives {

	public static int negatives(int[][] matrix) {

		if (matrix.length == 0) {
			return 0;
		}

		int minus = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] < 0) {
					minus++;
				}
			}
		}
		return minus;
	}

	public static int negativeInLinearTime(int[][] matrix) {

		if (matrix.length == 0) {
			return 0;
		}

		int m = matrix.length;
		int n = matrix[0].length;

		int i = 0, j = n - 1;
		int negative = 0;

		while (i <= m - 1 && j >= 0) {

			if (matrix[i][j] < 0) {
				negative += j + 1;
				i++;
			} else
				j--;
		}
		return negative;
	}

	public static void main(String[] args) {

		int[][] matrix = { { -7, -3, -1, 3, 5 }, { -3, -2, 2, 4, 6 }, { -1, 1, 3, 5, 8 }, { 3, 4, 7, 8, 9 } };
//		System.out.println(negatives(matrix));
		System.out.println(negativeInLinearTime(matrix));

	}
}
