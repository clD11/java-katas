package com.github.java_katas.data_structure.graphs;

import com.github.java_katas.data_structure.stacks_queues.Bag;

public class UndirectedGraph implements Graph {

    private final int v;
    private final Bag<Integer>[] adj;

    public UndirectedGraph(int v) {
        this.v = v;
        this.adj = (Bag<Integer>[]) new Bag[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new Bag<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public int numberOfVertices() {
        return adj.length;
    }
}