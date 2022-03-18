package com.dailybyte;

//nums = [3, 7, 0, 5, 0, 2], rearrange nums to look like the following [3,7,5,2,0,0]
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class RearrangeElements {

	public static void rearrange(ArrayList<Integer> elements) {

		LinkedList<Integer> afterArranging = new LinkedList<>(); // creating a linked list so that adding the elements
																	// in the last or in the front becomes easy

		for (int i = elements.size() - 1; i >= 0; i--) { // Reverse Iterating the ArrayList and the getting the element
															// from the index i
			if (elements.get(i) == 0) {
				afterArranging.addLast(elements.get(i)); // Adding the element to the last, if the element is 0
			} else
				afterArranging.addFirst(elements.get(i)); // Adding the element to the first, other that 0.
		}

		System.out.println(afterArranging);
	}

	public static void main(String[] args) {

		System.out
				.println("Enter series of numbers to shift the 0's to the end of the list\nEnter the size of elements");
		Scanner in = new Scanner(System.in); // Asking the user to enter the size data

		int size = in.nextInt(); // asking the size or number of elements he is entering
		int count = 0; // declaring a counter to check the number of zeros
		ArrayList<Integer> elements = new ArrayList<>(); // creating an ArrayList so that accessing a specific element
															// from an index is easy or faster

		for (int i = 0; i < size; i++) { // Iterating to the enter the data into the array list
			elements.add(in.nextInt());
		}

		for (int i = 0; i < size; i++) {
			if (elements.get(i) == 0)
				count++;
		}

		if (count == size)
			System.out.println(elements); // Printing the elements without calling the function, if all the elements
											// were 0's.
		else
			RearrangeElements.rearrange(elements); // calling the rearrange method and passing the ArrayList as a
													// parameter
		in.close(); // closing the resources

	}

}
