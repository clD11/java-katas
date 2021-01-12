package com.github.java_katas.algorithms.graphs.undirected;

import com.github.java_katas.data_structure.graphs.UndirectedGraph;

public class ConnectedComponentsDFS {

    private final boolean[] marked;
    private final int[] id;
    private final int[] size;
    private int count;

    public ConnectedComponentsDFS(UndirectedGraph undirectedGraph) {
        this.marked = new boolean[undirectedGraph.numberOfVertices()];
        this.id = new int[undirectedGraph.numberOfVertices()];
        this.size = new int[undirectedGraph.numberOfVertices()];
        for (int v = 0; v < undirectedGraph.numberOfVertices(); v++) {
            if (!marked[v]) {
                dfs(undirectedGraph, v);
                count++;
            }
        }
    }

    private void dfs(UndirectedGraph undirectedGraph, int v) {
        marked[v] = true;
        id[v] = count;
        size[count]++;
        for (int w : undirectedGraph.adj(v)) {
            if (!marked[w]) {
                dfs(undirectedGraph, w);
            }
        }
    }

    public int getCount() {
        return count;
    }

    public int getId(int v) {
        return id[v];
    }

    public int getComponentSize(int component) {
        return size[component];
    }
}