package com.dailybyte;

/*You are going on a vacation in which you need to take multiple planes to get to your destination. 
 * You are given a list, flights, that represents a set of your flights. 
 * Each flight is a list itself that contains two elements, the departing city and the arriving city respectively. 
 * Return the destination city.
 * Note: The destination city is the city that does not contain an outgoing flight and it is guaranteed there is a unique answer.

Ex: Given the following flights…

flights = [["A", "B"], ["B", "C"]], return "C".

Ex: Given the following flights…

flights = [["A", "B"], ["C", "D"], ["B", "C"]], return "D".*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VacationDestination {

	public static String destination(List<List<String>> flightList) {
		
		List<String> sortedFlights = new ArrayList<String>();
		for (int i = 0; i < flightList.size(); i++) {
			
			sortedFlights.addAll(flightList.get(i));
		}
		Collections.sort(sortedFlights);
		
		return sortedFlights.get(sortedFlights.size() - 1);
	}

	public static void main(String[] args) {
		System.out.println("Enter the list of flights");

		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		List<List<String>> flightList = new ArrayList<>();

		for (int i = 0; i < size; i++) {

			List<String> flights = new ArrayList<>();

			for (int j = 0; j < 2; j++) {
				flights.add(in.next());
			}

			flightList.add(flights);
		}
		
		System.out.println(destination(flightList));
		in.close();
	}
}
