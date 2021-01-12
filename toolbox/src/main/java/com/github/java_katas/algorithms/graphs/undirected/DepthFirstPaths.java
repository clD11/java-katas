package com.github.java_katas.algorithms.graphs.undirected;

import com.github.java_katas.data_structure.graphs.UndirectedGraph;

import java.util.Stack;

public class DepthFirstPaths {

    private final boolean[] marked;
    private final int[] edgeTo;
    private final int s;

    public DepthFirstPaths(UndirectedGraph undirectedGraph, int s) {
        this.marked = new boolean[undirectedGraph.numberOfVertices()];
        this.edgeTo = new int[undirectedGraph.numberOfVertices()];
        this.s = s;
        dfs(undirectedGraph, s);
    }

    private void dfs(UndirectedGraph undirectedGraph, int v) {
        marked[v] = true;
        for (int w : undirectedGraph.adj(v)) {
            if (!marked[w]) {
                dfs(undirectedGraph, w);
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