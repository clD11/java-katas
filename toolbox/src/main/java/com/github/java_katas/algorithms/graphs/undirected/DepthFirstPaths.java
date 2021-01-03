package com.github.java_katas.algorithms.graphs.undirected;

import com.github.java_katas.data_structure.graphs.Graph;

import java.util.Stack;

public class DepthFirstPaths {

    private final boolean[] marked;
    private final int[] edgeTo;
    private final int s;

    public DepthFirstPaths(Graph graph, int s) {
        this.marked = new boolean[graph.numberOfVertices()];
        this.edgeTo = new int[graph.numberOfVertices()];
        this.s = s;
        dfs(graph, s);
    }

    private void dfs(Graph graph, int v) {
        marked[v] = true;
        for (int w : graph.adj(v)) {
            if (!marked[w]) {
                dfs(graph, w);
                edgeTo[w] = v;
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