package com.dailybyte;

/*Given an array of integers, nums, each element in the array either appears once or twice. Return a list containing all the numbers that appear twice.
Note: Each element in nums is between one and nums.length (inclusive).

Ex: Given the following array nums…

nums = [2, 3, 1, 5, 5], return [5].
Ex: Given the following array nums…

nums = [1, 2, 3], return [].
Ex: Given the following array nums…

nums = [7, 2, 2, 3, 3, 4, 4], return [2,3,4].*/
import java.util.ArrayList;
import java.util.Scanner;

public class TakeTwo {

	public static ArrayList<Integer> onceOrTwice(ArrayList<Integer> elements) {

		ArrayList<Integer> arrayOfTwos = new ArrayList<>();
		for (int i = 0; i < elements.size() - 1; i++) {

			if (elements.get(i).equals(elements.get(i + 1))) {
				arrayOfTwos.add(elements.get(i));
			}
		}
		return arrayOfTwos;
	}

	public static void main(String[] args) {

		System.out.println("Enter the no of elements that you want to enter");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();

		ArrayList<Integer> elements = new ArrayList<>(size);
		for (int i = 0; i < size; i++) {
			elements.add(in.nextInt());
		}
		System.out.println(TakeTwo.onceOrTwice(elements));
		in.close();

	}

}
