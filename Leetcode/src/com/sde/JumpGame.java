package com.sde;

import java.util.Scanner;

public class JumpGame {

	public static int isReachable(int[] arr) {

		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i > max) {
				return 0;
			}
			max = (max > (i + arr[i])) ? max : (i + arr[i]);
		}
		return 1;
	}

	public static void main(String[] args) {

		System.out.println("enter the size of the array");
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		System.out.println("enter the elements into the array");
		int[] boxes = new int[size];

		for (int i = 0; i < size; i++) {
			boxes[i] = in.nextInt();
		}

		System.out.println(isReachable(boxes));
		in.close();
	}
}
