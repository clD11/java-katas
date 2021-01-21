package com.github.java_kata.scratch_pad.stuff;

import java.util.*;
import java.util.stream.Collectors;

public class ScratchPad {

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("anna", 1, "bob", 2, "chad", 90, "billy", 8);
        List<Map.Entry> result = map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                .collect(Collectors.toList());
        //int n = Integer.parseInt(args[0]);
//        System.out.println(result.subList(0, (map.size() >= n) ? n : map.size()).stream().map(e -> e.getKey())
//                .collect(Collectors.toList()));
        loops();
    }

    public static void loops() {
        int a[] = {1, 2, 3, 4, 5, 6};
        int i = a.length - 1;
        int j = i;
        while (j >= 0) {
            System.out.print(a[j]);
            j = --i;
        }
    }
}