package com.fcc.graphs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class HasPathDFS {

	public boolean isPathExists(Map<Character, List<Character>> graph, Character src, Character dest) {

		if (graph.get(src) == null)
			return false;

		if (src == dest)
			return true;

		for (Character ch : graph.get(src)) {
			if (isPathExists(graph, ch, dest)) {
				return true;
			}
		}
		return false;
	}

	public boolean isPathBFS(Map<Character, List<Character>> graph, Character src, Character dest) {

		Queue<Character> queue = new ArrayDeque<>();
		queue.offer(src);

		while (queue.size() > 0) {

			Character current = queue.poll();
			if (current == dest)
				return true;
			for (Character ch : graph.get(current)) {
				queue.offer(ch);
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Map<Character, List<Character>> graph = new HashMap<>();
		graph.put('a', Arrays.asList('c', 'b'));
		graph.put('b', Arrays.asList('d'));
		graph.put('c', Arrays.asList('e'));
		graph.put('d', Arrays.asList('f'));
		graph.put('e', Arrays.asList());
		graph.put('f', Arrays.asList());

		HasPathDFS hp = new HasPathDFS();
		System.out.println("DFS with recursion " + hp.isPathExists(graph, 'a', 'f'));
		System.out.println("BFS with queue " + hp.isPathBFS(graph, 'a', 'f'));

	}
}
