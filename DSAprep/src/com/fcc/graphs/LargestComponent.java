package com.fcc.graphs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LargestComponent {

	public int largestComponent(Map<Integer, List<Integer>> graph, Integer current, Set<Integer> visited) {

		if (visited.contains(current))
			return 0;

		visited.add(current);
		int size = 1;

		for (Integer in : graph.get(current)) {
			size += largestComponent(graph, in, visited);
		}
		return size;
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

		int longest = 0;
		Set<Integer> visited = new HashSet<Integer>();
		LargestComponent lc = new LargestComponent();

		for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
			int size = lc.largestComponent(graph, entry.getKey(), visited);
			if (size > longest)
				longest = size;
		}
		System.out.println(longest);
	}
}
