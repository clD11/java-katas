package problem_solving;

import com.google.common.collect.ImmutableMap;

public class NumberConverter {

    private final ImmutableMap<Integer, String> numberToNumeral = new ImmutableMap.Builder<Integer, String>()
            .put(10, "X")
            .put(9, "IX")
            .put(8, "VIII")
            .put(7, "VII")
            .put(6, "VI")
            .put(5, "V")
            .put(4, "IV")
            .put(3, "III")
            .put(2, "II")
            .put(1, "I")
            .build();

    public String toRomanNumeral(int normalNumber) {
        StringBuilder numeral = new StringBuilder();
        for (Integer numeric : numberToNumeral.keySet()) {
            if (normalNumber >= numeric) {
                numeral.append(numberToNumeral.get(numeric));
                normalNumber -= numeric;
            }
            if (normalNumber <= 0) {
                break;
            }
        }
        return numeral.toString();
    }
}
