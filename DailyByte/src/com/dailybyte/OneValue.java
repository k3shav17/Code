package com.dailybyte;

/*Given an array of integers, nums, every value appears three times except one value which only appears once. Return the value that only appears once.

Ex: Given the following array nums…

nums = [1, 2, 2, 2, 3, 3, 3], return 1.

Ex: Given the following array nums…

nums = [3, 3, 2, 5, 2, 2, 5, 3, 9, 5], return 9.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OneValue {

	public static int findingDistinct(List<Integer> elements) {

		int count = 0;
		int distinct = 0;
		Collections.sort(elements);
		List<Integer> dupeList = new ArrayList<Integer>(elements);

		for (int i = 0; i < elements.size(); i++) {
			count = 0;
			for (int j = i + 1; j < dupeList.size() - 1; j++) {
				if (elements.get(i) == dupeList.get(j));
				count++;
			}
			
			if (count <= 1) {
				distinct = elements.get(i);
				break;
			} else continue;
		}
		return distinct;
	}

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
//		Scanner in = new Scanner(System.in);
//		int size = in.nextInt();
//
//		System.out.println("Enter the elements into the array");
//		List<Integer> elements = new ArrayList<>();
//
//		for (int i = 0; i < size; i++) {
//			elements.add(in.nextInt());
//		}
//		System.out.println(OneValue.findingDistinct(new ArrayList<Integer>(Arrays.asList(3, 3, 2, 5, 2, 2, 5, 3, 9, 5))));
		System.out.println(OneValue.findingDistinct(new ArrayList<Integer>(Arrays.asList(1, 2, 2, 2, 3, 3, 3))));

		
	}
}
