package com.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * Given a list of intervals: [s, e] for meetings.
 * Find the least number of meeting rooms required
 * 
 * Constraints: 
 * 1 <= N <= 1e5
 * 1 <= A[i][0] <= A[i][1] <= 1e9
 * 
 * Eg: 
 * Input: [[5, 10], [15, 20], [0, 30]]
 * Output: 2
 * 
 * Explanation
 * [0, 30] and [5, 10] takes place simultaneously
 * [0, 30] and [15, 20] as well
 * */
public class MeetingRooms {

	public int maxRooms(List<List<Integer>> meetings) {

		Map<Integer, Integer> rooms = new HashMap<>();
		int max = 0;
		int current = 0;

		for (List<Integer> meets : meetings) {
			for (int i = 0; i < meets.size(); i++) {
				rooms.put(meets.get(0), 1);
				rooms.put(meets.get(1), -1);
			}
		}

		TreeMap<Integer, Integer> sortedRooms = new TreeMap<Integer, Integer>(rooms);

		for (Map.Entry<Integer, Integer> entry : sortedRooms.entrySet()) {
			current = current + entry.getValue();
			if (current > max) {
				max = current;
			}
		}
		return max;
	}

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();

		list1.add(5);
		list1.add(10);
		list2.add(15);
		list2.add(20);
		list3.add(0);
		list3.add(30);

		List<List<Integer>> meetings = new ArrayList<>();
		meetings.add(list1);
		meetings.add(list2);
		meetings.add(list3);

		MeetingRooms mr = new MeetingRooms();
		System.out.println(mr.maxRooms(meetings));
	}
}
