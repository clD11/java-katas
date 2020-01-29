package problem_solving;

public class BreakingRecordsImpl {

    public int[] breakingRecords(int[] scores) {
        int[] result = new int[2];

        int lowest = scores[0];
        int highest = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
                result[1]++;
            }
            if (scores[i] > highest) {
                highest = scores[i];
                result[0]++;
            }
        }

        return result;
    }
}
