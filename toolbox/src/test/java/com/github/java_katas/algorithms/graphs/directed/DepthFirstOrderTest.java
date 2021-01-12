package com.github.java_katas.algorithms.graphs.directed;

import com.github.java_katas.data_structure.graphs.Digraph;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DepthFirstOrderTest {

    @Test
    void shouldReturnTopologicalSearch() {
        Digraph digraph = new Digraph(7);
        digraph.addEdge(0, 5);
        digraph.addEdge(0, 2);
        digraph.addEdge(0, 1);
        digraph.addEdge(3, 6);
        digraph.addEdge(3, 5);
        digraph.addEdge(3, 4);
        digraph.addEdge(5, 2);
        digraph.addEdge(6, 4);
        digraph.addEdge(6, 0);
        digraph.addEdge(3, 2);
        digraph.addEdge(1, 4);
        DepthFirstOrder depthFirstOrder = new DepthFirstOrder(digraph);
        Iterable<Integer> actual = depthFirstOrder.reversePost();
        List<Integer> expected = List.of(4, 1, 2, 5, 0, 6, 3);
        assertThat(actual, is(expected));
    }

}