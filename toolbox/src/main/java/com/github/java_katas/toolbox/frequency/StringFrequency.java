package com.github.java_katas.toolbox.frequency;

import java.util.*;

public class StringFrequency {

    public Map<String, Integer> findFrequency(List<String> input) {
        Map<String, Integer> frequencies = new HashMap<>();
        for (String key : input) {
            Integer value = frequencies.get(key);
            if (value == null) {
                frequencies.put(key, 1);
            } else {
                frequencies.put(key, ++value);
            }
        }
        return frequencies;
    }

    public List<String> findFrequency(List<String> input, int range) {
        Map<String, Integer> frequencies = findFrequency(input);

        SortedMap<String, Integer> sortedMap = new TreeMap<>(new ValueComparator(frequencies));
        sortedMap.putAll(frequencies);

        List<String> result = new ArrayList<>();

        int count = 0;
        for (String key : sortedMap.keySet()) {
            if (count >= range) {
                break;
            }
            result.add(key);
            count++;
        }

        return result;
    }

    class ValueComparator implements Comparator<String> {
        Map<String, Integer> base;

        public ValueComparator(Map<String, Integer> base) {
            this.base = base;
        }

        public int compare(String a, String b) {
            if (base.get(a) >= base.get(b)) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
