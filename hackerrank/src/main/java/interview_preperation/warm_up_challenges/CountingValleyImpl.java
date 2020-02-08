package interview_preperation.warm_up_challenges;

public class CountingValleyImpl {

    public int countingValleys(int n, String s) {
        int level = 0;
        int valley = 0;

        char[] steps = s.toCharArray();
        for (int i = 0; i < steps.length; i++) {
            if (steps[i] == 'U') {
                level++;
            } else {
                level--;
            }

            if (level == 0 && steps[i] == 'U') {
                valley++;
            }
        }
        return valley;
    }
}
