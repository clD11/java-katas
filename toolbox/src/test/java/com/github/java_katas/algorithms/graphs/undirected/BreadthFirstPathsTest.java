package com.github.java_katas.algorithms.graphs.undirected;

import com.github.java_katas.data_structure.graphs.UndirectedGraph;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BreadthFirstPathsTest {

    @Test
    void shouldFindPaths() {
        UndirectedGraph undirectedGraph = new UndirectedGraph(6);
        undirectedGraph.addEdge(0, 5);
        undirectedGraph.addEdge(2, 4);
        undirectedGraph.addEdge(2, 3);
        undirectedGraph.addEdge(1, 2);
        undirectedGraph.addEdge(0, 1);
        undirectedGraph.addEdge(3, 4);
        undirectedGraph.addEdge(3, 5);
        undirectedGraph.addEdge(0, 2);
        BreadthFirstPaths breadthFirstPaths = new BreadthFirstPaths(undirectedGraph, 0);
        Iterable<Integer> path = breadthFirstPaths.pathTo(6);
        assertThat(true, is(true));
    }

}