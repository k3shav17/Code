package com.fcc.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class GraphsDFS {

	public List<Character> dfsInGraph(Map<Character, List<Character>> graph, Character root) {

		List<Character> path = new ArrayList<>();
		Stack<Character> stack = new Stack<>();
		stack.push(root);

		while (stack.size() > 0) {

			Character current = stack.pop();
			path.add(current);

			for (Character ch : graph.get(current)) {
				stack.push(ch);
			}
		}
		return path;
	}

	public void dfsInGraphRec(Map<Character, List<Character>> graph, Character root) {

		if (graph.get(root).size() == 0)
			return;
		System.out.println(root);
		for (Character ch : graph.get(root)) {
			dfsInGraphRec(graph, ch);
		}
	}

	public static void main(String[] args) {

		Map<Character, List<Character>> graph = new HashMap<>();
		graph.put('a', Arrays.asList('b', 'c'));
		graph.put('b', Arrays.asList('d'));
		graph.put('c', Arrays.asList('e'));
		graph.put('d', Arrays.asList('f'));
		graph.put('e', Arrays.asList());
		graph.put('f', Arrays.asList());

		GraphsDFS gdfs = new GraphsDFS();
		System.out.println(gdfs.dfsInGraph(graph, 'a'));
		gdfs.dfsInGraphRec(graph, 'a');

	}
}
