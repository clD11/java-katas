package com.github.java_katas.data_structure.graphs;

import com.github.java_katas.data_structure.stacks_queues.Bag;

public class Digraph {

    private final int v;
    private final Bag<Integer>[] adj;

    public Digraph(int v) {
        this.v = v;
        this.adj = (Bag<Integer>[]) new Bag[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new Bag<>();
        }
    }

    public void addEdge(int v, int w) {
        // From v to w
        adj[v].add(w);
    }

    public Iterable<Integer> adj(int v) {
        // pointing from v
        return adj[v];
    }

}