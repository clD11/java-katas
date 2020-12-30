package problem_solving;

import java.util.*;

public class MissingNumbers {

    public int[] missingNumbers(int[] arr, int[] brr) {
        Map<Integer, Integer> arrToFrequency = new HashMap<>();
        for (int i : arr) {
            Integer freq = arrToFrequency.getOrDefault(i, 0);
            arrToFrequency.put(i, ++freq);
        }

        Set<Integer> missingNumbers = new HashSet<>();

        for (int i : brr) {
            Integer num = arrToFrequency.get(i);
            if (num == null || num <= 0) {
                missingNumbers.add(i);
            } else {
                num -= 1;
                arrToFrequency.put(i, num);
            }
        }

        int[] missingNumbersSorted = missingNumbers.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(missingNumbersSorted);

        return missingNumbersSorted;
    }

}
