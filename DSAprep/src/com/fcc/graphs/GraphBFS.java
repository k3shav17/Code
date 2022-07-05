package com.fcc.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class GraphBFS {

	public List<Character> bfsInGraph(Map<Character, List<Character>> graph, Character root) {

		List<Character> path = new ArrayList<>();

		if (graph.get(root) == null) {
			return path;
		}

		Queue<Character> queue = new ArrayDeque<>();
		queue.offer(root);

		while (queue.size() > 0) {
			Character current = queue.poll();
			path.add(current);

			for (Character ch : graph.get(current)) {
				queue.offer(ch);
			}
		}
		return path;
	}

	public static void main(String[] args) {

		Map<Character, List<Character>> graph = new HashMap<>();
		graph.put('a', Arrays.asList('c', 'b'));
		graph.put('b', Arrays.asList('d'));
		graph.put('c', Arrays.asList('e'));
		graph.put('d', Arrays.asList('f'));
		graph.put('e', Arrays.asList());
		graph.put('f', Arrays.asList());

		GraphBFS gbfs = new GraphBFS();
		System.out.println(gbfs.bfsInGraph(graph, 'a'));
	}
}
