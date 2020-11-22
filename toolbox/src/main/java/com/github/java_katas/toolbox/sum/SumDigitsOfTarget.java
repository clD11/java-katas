package com.github.java_katas.toolbox.sum;

public class SumDigitsOfTarget {

    public int sum(int input) {
        int sum = 0;
        while (input > 0) {
            int right = input % 10;
            sum += right;
            input = input / 10;
        }
        return sum;
    }
}
