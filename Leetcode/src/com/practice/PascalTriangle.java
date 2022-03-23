package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {

		System.out.println("Enter the number till where you wants to print the triangle");
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();

		System.out.println(PascalTriangle.printingPascal(num));
		in.close();
	}

	private static List<List<Integer>> printingPascal(int num) {

		List<List<Integer>> pascal = new ArrayList<>();
		List<Integer> firstElement = new ArrayList<>();
		firstElement.add(1);

		pascal.add(firstElement);

		for (int i = 1; i < num; i++) {

			List<Integer> previousRow = pascal.get(i - 1);
			List<Integer> nextRow = new ArrayList<>();

			nextRow.add(1);
			for (int j = 1; j < i; j++) {

				nextRow.add(previousRow.get(j - 1) + previousRow.get(j));
			}
			nextRow.add(1);
			pascal.add(nextRow);
		}
		return pascal;
	}
}
