package com.github.java_katas.algorithms.graphs.undirected;

import com.github.java_katas.algorithms.graphs.undirected.ConnectedComponentsDFS;
import com.github.java_katas.data_structure.graphs.Graph;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class ConnectedComponentsDFSTest {

    @Test
    void shouldFindConnectedComponents() {
        Graph graph = new Graph(13);
        graph.addEdge(0, 5);
        graph.addEdge(4, 3);
        graph.addEdge(0, 1);
        graph.addEdge(9, 12);
        graph.addEdge(6, 4);
        graph.addEdge(5, 4);
        graph.addEdge(0, 2);
        graph.addEdge(11, 12);
        graph.addEdge(9, 10);
        graph.addEdge(0, 6);
        graph.addEdge(7, 8);
        graph.addEdge(9, 11);
        graph.addEdge(5, 3);

        ConnectedComponentsDFS connectedComponentsDFS = new ConnectedComponentsDFS(graph);

        assertThat(connectedComponentsDFS.getCount(), is(3));
        assertThat(connectedComponentsDFS.getComponentSize(0), is(7));
        assertThat(connectedComponentsDFS.getComponentSize(1), is(2));
        assertThat(connectedComponentsDFS.getComponentSize(2), is(4));
    }

}