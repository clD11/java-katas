package com.github.java_katas.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WordsBySize {

    public String execute(String input) {
        Map<Integer, String> sizeToWord = new TreeMap<>();
        String[] words = input.split(" ");

        int sum = 0;
        for (String word : words) {
            for (char c : word.toCharArray()) {
                sum += c;
            }
            sizeToWord.put(sum, word);
        }

        StringBuilder ascendingSentence = new StringBuilder();

        List<Integer> reverseKeys = new ArrayList(sizeToWord.keySet());
        for (int i = reverseKeys.size() - 1; i >= 0; i--) {
            ascendingSentence.append(sizeToWord.get(reverseKeys.get(i))).append(" ");
        }

        return ascendingSentence.toString().strip();
    }

}
