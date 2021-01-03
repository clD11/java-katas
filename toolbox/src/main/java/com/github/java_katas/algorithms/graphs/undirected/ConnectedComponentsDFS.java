package com.github.java_katas.algorithms.graphs.undirected;

import com.github.java_katas.data_structure.graphs.Graph;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConnectedComponentsDFS {

    private final boolean[] marked;
    private final int[] id;
    private final int[] size;
    private int count;

    public ConnectedComponentsDFS(Graph graph) {
        this.marked = new boolean[graph.numberOfVertices()];
        this.id = new int[graph.numberOfVertices()];
        this.size = new int[graph.numberOfVertices()];
        for (int v = 0; v < graph.numberOfVertices(); v++) {
            if (!marked[v]) {
                dfs(graph, v);
                count++;
            }
        }
    }

    private void dfs(Graph graph, int v) {
        marked[v] = true;
        id[v] = count;
        size[count]++;
        for (int w : graph.adj(v)) {
            if (!marked[w]) {
                dfs(graph, w);
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