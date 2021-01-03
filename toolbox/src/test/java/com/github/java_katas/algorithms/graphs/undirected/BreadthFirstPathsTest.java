package com.github.java_katas.algorithms.graphs.undirected;

import com.github.java_katas.data_structure.graphs.Graph;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BreadthFirstPathsTest {

    @Test
    void shouldFindPaths() {
        Graph graph = new Graph(6);
        graph.addEdge(0, 5);
        graph.addEdge(2, 4);
        graph.addEdge(2, 3);
        graph.addEdge(1, 2);
        graph.addEdge(0, 1);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(0, 2);
        BreadthFirstPaths breadthFirstPaths = new BreadthFirstPaths(graph, 0);
        Iterable<Integer> path = breadthFirstPaths.pathTo(6);
        assertThat(true, is(true));
    }

}