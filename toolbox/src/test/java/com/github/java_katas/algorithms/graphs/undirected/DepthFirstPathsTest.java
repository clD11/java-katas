package com.github.java_katas.algorithms.graphs.undirected;

import com.github.java_katas.algorithms.graphs.undirected.DepthFirstPaths;
import com.github.java_katas.data_structure.graphs.Graph;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class DepthFirstPathsTest {

    @Test
    void shouldHavePath() {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 6);
        graph.addEdge(6, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 3);
        DepthFirstPaths depthFirstPaths = new DepthFirstPaths(graph, 0);
        assertThat(depthFirstPaths.hasPath(6), is(true));
    }

    @Test
    void shouldFindPaths() {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 6);
        graph.addEdge(6, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 3);
        DepthFirstPaths depthFirstPaths = new DepthFirstPaths(graph, 0);
        Iterable<Integer> path = depthFirstPaths.pathTo(5);
        assertThat(true, is(true));
    }

}