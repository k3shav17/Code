package com.dailybyte;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt(); // no of elements

		System.out.println("Enter the number of rotations you want \n >");
		int queries = in.nextInt(); // no of rotations

		System.out.println("Enter the elements");
		int[] elements = new int[size];
		int[] rotated = new int[size];

		for (int i = 0; i < size; i++) {
			elements[i] = in.nextInt(); // filling elements into an array

		}

		// last elements of the array will be added to the start of array name "rotated"
		// till the no of queries
		for (int i = 0, j = queries - 1; i < queries; i++) {
			rotated[j--] = elements[elements.length - (i + 1)];

		}

		// remaining elements will be added to the "rotated" array
		for (int j = 0; j < size - queries; j++) {
			rotated[j + queries] = elements[j];
		}

		// printing the array
		for (int i = 0; i < rotated.length; i++) {
			System.out.print(rotated[i] + " ");
		}
		in.close();
	}

}
