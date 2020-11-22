package com.github.java_katas.toolbox.frequency;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegerFrequency {

    public Map<Integer, Integer> findFrequency(List<Integer> input) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (Integer key : input) {
            Integer frequency = frequencies.get(key);
            if (frequency == null) {
                frequencies.put(key, 1);
            } else {
                frequencies.put(key, ++frequency);
            }
        }
        return frequencies;
    }

}
