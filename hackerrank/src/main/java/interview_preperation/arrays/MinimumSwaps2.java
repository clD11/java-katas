package interview_preperation.arrays;

import java.util.HashMap;
import java.util.Map;

public class MinimumSwaps2 {

    public int minimumSwaps(int[] arr) {
        boolean[] isVisited = new boolean[arr.length + 1];
        Map<Integer, Integer> nodeMap = new HashMap<>();

        for (int i = 1; i < isVisited.length; i++) {
            nodeMap.put(i, arr[i - 1]);
        }

        int swaps = 0;
        for (int i = 1; i < nodeMap.size(); i++) {
            int nextNode;

            if(isVisited[i] == false) {
                isVisited[i] = true;

                if (i == nodeMap.get(i)) {
                    continue;
                } else {
                    int c = nodeMap.get(i);
                    while (!isVisited[c]) {
                        isVisited[c] = true;
                        nextNode = nodeMap.get(c);
                        c = nextNode;
                        ++swaps;
                    }
                }
            }
        }
        return swaps;
    }

    // Selection sort O(n^2), in place O(n) writes
    public int minimumSwapsSelectionSort(int[] arr) {
        int swaps = 0;
        int minPos = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }

            if ( i != minPos) {
                swap(arr, i, minPos);
                swaps++;
            }
            minPos = i + 1;
        }
        return swaps;
    }

    public int[] swap(int[] arr, int i, int j) {
        int a = arr[j];
        arr[j] = arr[i];
        arr[i] = a;
        return arr;
    }
}
