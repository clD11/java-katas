package com.github.java_katas.algorithms.graphs.undirected;

import com.github.java_katas.data_structure.graphs.UndirectedGraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BreadthFirstPaths {

    private final boolean[] marked;
    private final int[] edgeTo;
    private final int s;

    public BreadthFirstPaths(UndirectedGraph undirectedGraph, int s) {
        this.marked = new boolean[undirectedGraph.numberOfVertices()];
        this.edgeTo = new int[undirectedGraph.numberOfVertices()];
        this.s = s;
        this.bfs(undirectedGraph, s);
    }

    private void bfs(UndirectedGraph undirectedGraph, int s) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        marked[s] = true;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int w : undirectedGraph.adj(v)) {
                if (!marked[w]) {
                    queue.add(w);
                    marked[w] = true;
                    edgeTo[w] = v;
                }
            }
        }
    }

    public boolean hasPath(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        Stack<Integer> path = new Stack<>();
        if (hasPath(v)) {
            for (int x = v; x != s; x = edgeTo[x]) {
                path.push(x);
            }
            path.push(s);
        }
        return path;
    }

}