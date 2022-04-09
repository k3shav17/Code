package com.sde;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static List<Integer> spiralOrder(int[][] matrix) {
		
		List<Integer> spiral = new ArrayList<>();
		
		int r = matrix.length, c = matrix[0].length;
		return spiral;
	}
	public static void main(String[] args) {
		
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		System.out.println(spiralOrder(matrix));
	}
}
