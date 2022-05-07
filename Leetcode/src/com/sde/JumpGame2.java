package com.sde;

import java.util.Scanner;

public class JumpGame2 {

	public static int minJumps(int[] arr) {

		int max = arr[arr.length - 1], count = 0, steps = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			steps = arr[i] + i;
			if (steps > max) {
				break;
			} else
				count++;
		}

		return count;
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

		System.out.println(minJumps(boxes));
		in.close();

	}
}
