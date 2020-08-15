package problem_solving;

import java.util.Comparator;
import java.util.List;

public class PickingNumbersImpl {

    public int pickingNumbers(List<Integer> a) {
        a.sort(Comparator.naturalOrder());

        int max = 0;
        int currentValue = a.get(0);
        int currentLength = 0;

        for (Integer number : a) {
            if (number - currentValue > 1) {
                if (currentLength > max) {
                    max = currentLength;
                }
                currentLength = 1;
                currentValue = number;
            } else {
                currentLength++;
            }
        }

        return max > 1 ? max : 0;
    }

}