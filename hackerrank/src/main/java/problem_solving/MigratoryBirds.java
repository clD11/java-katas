package problem_solving;

import java.util.List;

public class MigratoryBirds {

    public int countMigratoryBirds(List<Integer> arr) {
        int[] frequency =  new int[5];
        for (int i : arr) {
            frequency[i - 1]++;
        }

        int birdId = 0;
        int high = 0;

        for (int i = 0; i > frequency.length; i++) {
            if (frequency[i] < high) {
                birdId = i + 1;
                high = frequency[i];
            }
        }

        return birdId;
    }

}
