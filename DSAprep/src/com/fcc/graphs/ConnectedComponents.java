package com.fcc.graphs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConnectedComponents {

	public boolean explore(Map<Integer, List<Integer>> graph, Integer current, Set<Integer> visited) {

		if (visited.contains(current))
			return false;

		visited.add(current);
		
		for (Integer in : graph.get(current)) {
			explore(graph, in, visited);
		}
		return true;
	}

	public static void main(String[] args) {

		Map<Integer, List<Integer>> graph = new HashMap<>();
		graph.put(0, Arrays.asList(8, 1, 5));
		graph.put(1, Arrays.asList(0));
		graph.put(5, Arrays.asList(0, 8));
		graph.put(8, Arrays.asList(0, 5));
		graph.put(2, Arrays.asList(3, 4));
		graph.put(3, Arrays.asList(2, 4));
		graph.put(4, Arrays.asList(3, 2));

		int count = 0;
		Set<Integer> visited = new HashSet<Integer>();
		ConnectedComponents cc = new ConnectedComponents();

		for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
			if (cc.explore(graph, entry.getKey(), visited)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
