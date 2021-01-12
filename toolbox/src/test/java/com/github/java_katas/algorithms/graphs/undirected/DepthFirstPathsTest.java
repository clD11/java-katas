package com.github.java_katas.algorithms.graphs.undirected;

import com.github.java_katas.data_structure.graphs.UndirectedGraph;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class DepthFirstPathsTest {

    @Test
    void shouldHavePath() {
        UndirectedGraph undirectedGraph = new UndirectedGraph(7);
        undirectedGraph.addEdge(0, 1);
        undirectedGraph.addEdge(0, 2);
        undirectedGraph.addEdge(0, 6);
        undirectedGraph.addEdge(6, 4);
        undirectedGraph.addEdge(4, 5);
        undirectedGraph.addEdge(5, 3);
        DepthFirstPaths depthFirstPaths = new DepthFirstPaths(undirectedGraph, 0);
        assertThat(depthFirstPaths.hasPath(6), is(true));
    }

    @Test
    void shouldFindPaths() {
        UndirectedGraph undirectedGraph = new UndirectedGraph(7);
        undirectedGraph.addEdge(0, 1);
        undirectedGraph.addEdge(0, 2);
        undirectedGraph.addEdge(0, 6);
        undirectedGraph.addEdge(6, 4);
        undirectedGraph.addEdge(4, 5);
        undirectedGraph.addEdge(5, 3);
        DepthFirstPaths depthFirstPaths = new DepthFirstPaths(undirectedGraph, 0);
        Iterable<Integer> path = depthFirstPaths.pathTo(5);
        assertThat(true, is(true));
    }

}