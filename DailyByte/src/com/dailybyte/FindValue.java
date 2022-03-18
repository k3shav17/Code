package com.dailybyte;

/*Given a sorted integer array nums and a target, search for the target with in the array. 
 * If the targets exists within the array, return its index. 
 * If it does not exist within the array, return -1.

Ex: Given the following nums and target...

nums = [-5, -3, 0, 3, 8, 12, 40], target = 8, return 4.

Ex: Given the following nums and target...

nums = [1, 2, 3, 6, 8], target = 10, return -1.*/
import java.util.ArrayList;
import java.util.Scanner;

public class FindValue {

	public static int findingIndex(int index, ArrayList<Integer> elements) {

		for (int i = 0; i < elements.size(); i++) {
			if (index == elements.get(i))
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();

		ArrayList<Integer> elements = new ArrayList<>();
		System.out.println("Enter the elements in to the array");

		for (int i = 0; i < size; i++) {
			elements.add(in.nextInt());
		}
		System.out.println("Enter the element you want to find index in the array");
		int index = in.nextInt();

		System.out.println(FindValue.findingIndex(index, elements));
		in.close();
	}
}
