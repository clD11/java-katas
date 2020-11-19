package problem_solving;

import java.util.*;

public class DistinctPairs {

    private final Map<Integer, Set<Integer>> pairs = new HashMap<>();

    public int sum(ArrayList<Integer> nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (i != j) {
                    if (nums.get(i) + nums.get(j) == target) {
                        int lowest = (nums.get(i) < nums.get(j)) ? nums.get(i) : nums.get(j);
                        int highest = (nums.get(i) > nums.get(j)) ? nums.get(i) : nums.get(j);
                        Set<Integer> val;

                        if (!pairs.containsKey(lowest)) {
                            val = new HashSet<>();
                        } else {
                            val = pairs.get(lowest);
                        }

                        val.add(highest);
                        pairs.put(lowest, val);
                    }
                }
            }
        }
        int count = 0;
        for (Integer key : pairs.keySet()) {
            count += pairs.get(key).size();
        }
        return count;
    }
}