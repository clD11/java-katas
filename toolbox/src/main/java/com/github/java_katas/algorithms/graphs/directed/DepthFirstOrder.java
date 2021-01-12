package com.github.java_katas.algorithms.graphs.directed;

import com.github.java_katas.data_structure.graphs.Digraph;

import java.util.Stack;

public class DepthFirstOrder {

    private boolean[] marked;
    private Stack<Integer> reversePost;

    public DepthFirstOrder(Digraph digraph) {
        reversePost = new Stack<>();
        marked = new boolean[digraph.numberOfVertices()];
        for (int v = 0; v < digraph.numberOfVertices(); v++) {
            if (!marked[v]) {
                dfs(digraph, v);
            }
        }
    }

    private void dfs(Digraph digraph, int v) {
        marked[v] = true;
        for (int w : digraph.adj(v)) {
            if (!marked[w]) {
                dfs(digraph, w);
            }
        }
        reversePost.push(v);
    }

    public Iterable<Integer> reversePost() {
        return reversePost;
    }

}
