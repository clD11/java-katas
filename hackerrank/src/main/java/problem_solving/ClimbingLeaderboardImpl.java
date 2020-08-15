package problem_solving;

import java.util.*;

public class ClimbingLeaderboardImpl {

    public int[] climbingLeaderboard(int[] scores, int[] alice) {
        NavigableMap<Integer, Integer> leaderboard = new TreeMap<>();

        Arrays.setAll(scores, i -> ~scores[i]);
        Arrays.sort(scores);
        Arrays.setAll(scores, i -> ~scores[i]);

        for (int i = 0; i < scores.length; i++) {
            leaderboard.putIfAbsent(scores[i], leaderboard.size() + 1);
        }

        int[] ranks = new int[alice.length];
        for (int i = 0; i < alice.length; i++) {
            Integer rank = leaderboard.floorKey(alice[i]);
            if (rank == null) {
                ranks[i] = leaderboard.size() + 1;
            } else {
                ranks[i] = leaderboard.get(rank);
            }
        }

        return ranks;
    }

}
