package com.dailybyte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* Given the processes running in the memory and a segment of memory,
 * minimize the memory usage by deleting the contiguous processes.
 * 
 * Ex : process = [10,4,8,1] and segment m = 2; return 9
 * 
 * sum of 8 and 1 is 9, 10 and 4 will removed because 10 is the top most process
 * and 4 is the contiguous process of 10
 * */
public class MinimizeMemory {

	public static int minimizedUsage(List<Integer> processes, int segement) {

		List<Integer> originalProcess = new ArrayList<Integer>();

		Collections.sort(processes);

		int index = processes.get(processes.size() - 1);
		
		return index;
	}

	public static void main(String[] args) {

		System.out.println("enter the size of the array");

		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		System.out.println("enter the elements into the array");

		List<Integer> processes = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			processes.add(in.nextInt());
		}

		System.out.println("enter the memory segment that needs to be deleted");

		int segement = in.nextInt();

		System.out.println(minimizedUsage(processes, segement));
		in.close();

	}
}
