package com.github.java_katas.toolbox.sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumTwoArrayPairsToTarget {

    public List<List<Integer>> sum(int[] arr1, int[] arr2, int x) {
        Map<Integer, Integer> lookup = new HashMap<>();
        for (int num : arr1) {
            lookup.put(num, num);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int num : arr2) {
            int sub = x - num;
            Integer value = lookup.get(sub);
            if (value != null) {
                result.add(List.of(num, value));
            }
        }

        return result;
    }
}
