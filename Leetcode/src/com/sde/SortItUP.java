package com.sde;

import java.util.Scanner;

public class SortItUP {

	public static void sorting(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		System.out.println("enter the size of the array");
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		System.out.println("enter the elements into the array");
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}

		sorting(arr);
		in.close();
	}

}
