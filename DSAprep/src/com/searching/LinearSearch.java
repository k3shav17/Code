package com.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Linear search is a sequential searching algorithm,
 * where we start from one end and check every element of the list,
 * until the desired element is found. 
 * It is the simplest searching algorithm.
 * 
 * Time complexity = O(n)
 * Space complexity = O(1)
 */
public class LinearSearch {

	public static int searching(List<Integer> list, int target) {
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {

		System.out.println("enter the list elements in to the list, when you are done enter X");

		List<Integer> list = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		while (true) {
			
			String element = in.next();
			
			if (element.equalsIgnoreCase("x")) {
				break;
			} else list.add(Integer.parseInt(element));
		}
		
		System.out.println("enter the target element, which you want to search in the list");
		int target = in.nextInt();
		System.out.println(searching(list, target));
		in.close();
	}
}
