package com.github.java_katas.data_structure.graphs;

public interface Graph {
    void addEdge(int v, int w);
    Iterable<Integer> adj(int v);
    int numberOfVertices();
}
