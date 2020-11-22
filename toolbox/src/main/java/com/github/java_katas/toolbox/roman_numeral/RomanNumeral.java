package com.github.java_katas.toolbox.roman_numeral;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral {

    private static final Map<Integer, String> numberToNumeral = new LinkedHashMap<>();
    static {
        numberToNumeral.put(1000, "M");
        numberToNumeral.put(900, "CM");
        numberToNumeral.put(500, "D");
        numberToNumeral.put(400, "CD");
        numberToNumeral.put(100, "C");
        numberToNumeral.put(90, "XC");
        numberToNumeral.put(50, "L");
        numberToNumeral.put(40, "XL");
        numberToNumeral.put(10, "X");
        numberToNumeral.put(9, "IX");
        numberToNumeral.put(8, "VIII");
        numberToNumeral.put(7, "VII");
        numberToNumeral.put(6, "VI");
        numberToNumeral.put(5, "V");
        numberToNumeral.put(4, "IV");
        numberToNumeral.put(3, "III");
        numberToNumeral.put(2, "II");
        numberToNumeral.put(1, "I");
    }

    public String toRomanNumeral(int normalNumber) {
        StringBuilder numeral = new StringBuilder();
        int remainder = normalNumber;
        for (int key : numberToNumeral.keySet()) {
            while (remainder >= key) {
                remainder -= key;
                numeral.append(numberToNumeral.get(key));
            }
        }
        return numeral.toString();
    }
}
