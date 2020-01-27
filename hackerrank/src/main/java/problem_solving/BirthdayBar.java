package problem_solving;

import java.util.List;

public class BirthdayBar {

    // https://www.geeksforgeeks.org/window-sliding-technique/
    public int birthdaySlidingWindow(int[] s, int d, int m) {
        int sum = 0;
        int r = 0;
        for (int i = 0; i < s.length; i++) {
            sum += s[i];
            // M is never less than 1
            if (i > m - 1) sum -= s[i - m];
            if (i >= m - 1 && sum == d) r++;
        }
        return r;
    }

    public int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int squares = 0;

        if (s.size() == 1 && s.get(0) == d) {
            return 1;
        }

        for (int i = 0; i + m - 1 < s.size(); i++) {
            for (int j = 0; j < m; j++) {
                int  a = s.get(i + j);
                squares += a;
            }
            if (squares == d) {
                count++;
            }
            squares = 0;
        }
        return count;
    }
}