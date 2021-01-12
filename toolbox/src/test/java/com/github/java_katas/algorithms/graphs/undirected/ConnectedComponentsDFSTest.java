package com.github.java_katas.algorithms.graphs.undirected;

import com.github.java_katas.data_structure.graphs.UndirectedGraph;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class ConnectedComponentsDFSTest {

    @Test
    void shouldFindConnectedComponents() {
        UndirectedGraph undirectedGraph = new UndirectedGraph(13);
        undirectedGraph.addEdge(0, 5);
        undirectedGraph.addEdge(4, 3);
        undirectedGraph.addEdge(0, 1);
        undirectedGraph.addEdge(9, 12);
        undirectedGraph.addEdge(6, 4);
        undirectedGraph.addEdge(5, 4);
        undirectedGraph.addEdge(0, 2);
        undirectedGraph.addEdge(11, 12);
        undirectedGraph.addEdge(9, 10);
        undirectedGraph.addEdge(0, 6);
        undirectedGraph.addEdge(7, 8);
        undirectedGraph.addEdge(9, 11);
        undirectedGraph.addEdge(5, 3);

        ConnectedComponentsDFS connectedComponentsDFS = new ConnectedComponentsDFS(undirectedGraph);

        assertThat(connectedComponentsDFS.getCount(), is(3));
        assertThat(connectedComponentsDFS.getComponentSize(0), is(7));
        assertThat(connectedComponentsDFS.getComponentSize(1), is(2));
        assertThat(connectedComponentsDFS.getComponentSize(2), is(4));
    }

}