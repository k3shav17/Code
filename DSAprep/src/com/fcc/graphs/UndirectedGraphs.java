package com.fcc.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UndirectedGraphs {

	public static void main(String[] args) {

		List<List<Character>> edges = new ArrayList<>();

		edges.add(Arrays.asList('i', 'j'));
		edges.add(Arrays.asList('k', 'i'));
		edges.add(Arrays.asList('m', 'k'));
		edges.add(Arrays.asList('k', 'l'));
		edges.add(Arrays.asList('o', 'n'));

		UndirectedGraphs ug = new UndirectedGraphs();
		Map<Character, List<Character>> graph = ug.createGraph(edges);

		Set<Character> visited = new HashSet<Character>();
		System.out.println(ug.hasPath(graph, 'j', 'm', visited));
	}

	public boolean hasPath(Map<Character, List<Character>> graph, Character src, Character dst,
			Set<Character> visited) {

		if (src == dst)
			return true;

		if (visited.contains(src))
			return false;
		
		visited.add(src);

		for (Character ch : graph.get(src)) {
			if (hasPath(graph, ch, dst, visited))
				return true;
		}
		return false;
	}

	public Map<Character, List<Character>> createGraph(List<List<Character>> edges) {

		Map<Character, List<Character>> graph = new HashMap<>();

		for (List<Character> l : edges) {
			Character a = l.get(0);
			Character b = l.get(1);

			if (!(graph.containsKey(a)))
				graph.put(a, new ArrayList<Character>());
			if (!(graph.containsKey(b)))
				graph.put(b, new ArrayList<Character>());

			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		return graph;
	}
}
