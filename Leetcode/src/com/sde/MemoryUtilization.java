package com.sde;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MemoryUtilization {

	public static int memory(List<Integer> processes, int m) {

		List<Integer> tempList = new ArrayList<Integer>(processes);
		List<Integer> reducedMemory = new ArrayList<>();

		Collections.sort(tempList);

		int sum = 0;
		int maxMemory = tempList.get(tempList.size() - 1);

		for (int i = 0; i < processes.size() - 1; i++) {
			if (maxMemory == processes.get(i)) {

				if (maxMemory != processes.get(0)) {
					reducedMemory.add(processes.get(i - 1));
				}
				reducedMemory.add(processes.get(i));
				reducedMemory.add(processes.get(i + 1));
			}
		}

		for (int i = 0; i < processes.size(); i++) {
			if (!reducedMemory.contains(processes.get(i))) {

				sum += processes.get(i);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("enter the elements into the array, click x when you are done.");

		Scanner in = new Scanner(System.in);

		List<Integer> nums = new ArrayList<Integer>();

		while (true) {

			String element = in.nextLine();

			if (element.equalsIgnoreCase("x")) {
				break;
			} else
				nums.add(Integer.parseInt(element));
		}

		System.out.println("enter the m");
		int m = in.nextInt();

		System.out.println(memory(nums, m));
		in.close();
	}
}