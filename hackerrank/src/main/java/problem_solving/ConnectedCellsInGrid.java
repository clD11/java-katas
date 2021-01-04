package problem_solving;

import java.util.*;

public class ConnectedCellsInGrid {

    private boolean[] marked;
    private int[] id;
    private int[] size;
    private int count;

    public int connectedCell(int[][] matrix) {
        LinkedList<Integer>[] adj = buildGraph(matrix);

        this.marked = new boolean[adj.length];
        this.id = new int[adj.length];
        this.size = new int[adj.length];
        for (int v = 0; v < adj.length; v++) {
            if (!marked[v]) {
                dfs(adj, v);
                count++;
            }
        }

        return Arrays.stream(size).max().getAsInt();
    }

    private LinkedList<Integer>[] buildGraph(int[][] matrix) {
        int vertex = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] = vertex;
                    vertex++;
                } else {
                    matrix[i][j] = -1;
                }
            }
        }

        LinkedList<Integer>[] adj = new LinkedList[vertex];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new LinkedList<>();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                if (matrix[i][j] >= 0) {
                    // N
                    if (i > 0 && matrix[i - 1][j] >= 0) {
                        adj[matrix[i][j]].add(matrix[i - 1][j]);
                    }

                    // NE
                    if ((i > 0 && j < matrix[1].length - 1) && matrix[i - 1][j + 1] >= 0) {
                        adj[matrix[i][j]].add(matrix[i - 1][j + 1]);
                    }

                    // E
                    if (j < matrix[1].length - 1 && matrix[i][j + 1] >= 0) {
                        adj[matrix[i][j]].add(matrix[i][j + 1]);
                    }

                    // SE
                    if ((i < matrix.length - 1 && j < matrix[1].length - 1) && matrix[i + 1][j + 1] >= 0) {
                        adj[matrix[i][j]].add(matrix[i + 1][j + 1]);
                    }

                    // S
                    if (i < matrix.length - 1 && matrix[i + 1][j] >= 0) {
                        adj[matrix[i][j]].add(matrix[i + 1][j]);
                    }

                    // SW
                    if ((i < matrix.length - 1 && j > 0) && matrix[i + 1][j - 1] >= 0) {
                        adj[matrix[i][j]].add(matrix[i + 1][j - 1]);
                    }

                    // W
                    if (j > 0 && matrix[i][j - 1] >= 0) {
                        adj[matrix[i][j]].add(matrix[i][j - 1]);
                    }

                    // NW
                    if ((j > 0 && i > 0) && matrix[i - 1][j - 1] >= 0) {
                        adj[matrix[i][j]].add(matrix[i - 1][j - 1]);
                    }
                }
            }
        }
        return adj;
    }

    private void dfs(LinkedList<Integer>[] graph, int v) {
        marked[v] = true;
        id[v] = count;
        size[count]++;
        for (int w : graph[v]) {
            if (!marked[w]) {
                dfs(graph, w);
            }
        }
    }
}
