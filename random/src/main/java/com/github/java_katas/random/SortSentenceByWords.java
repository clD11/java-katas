package com.github.java_katas.random;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortSentenceByWords {

    public String execute(String input) {
        String[] words = input.split(" ");
        Arrays.sort(words);
        return Arrays.stream(words).collect(Collectors.joining(" "));
    }
}
