package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

	public static List<List<Integer>> printTriangle(int power) {

		List<List<Integer>> pascals = new ArrayList<>();
		List<Integer> firstRow = new ArrayList<>();

		firstRow.add(1);
		pascals.add(firstRow);
		if (power == 1) {
			return pascals;
		}

		for (int i = 1; i < power; i++) {

			List<Integer> previousRow = pascals.get(i - 1);
			List<Integer> row = new ArrayList<>();
			row.add(1);

			for (int j = 1; j < i; j++) {
				row.add(previousRow.get(j - 1) + previousRow.get(j));

			}
			row.add(1);
			pascals.add(row);

		}
		return pascals;
	}

	public static void main(String[] args) {

		System.out.println("Enter the number till the pascal triangle needs to be printed");
		Scanner in = new Scanner(System.in);
		int power = in.nextInt();
		System.out.println(printTriangle(power));
		in.close();
	}
}
