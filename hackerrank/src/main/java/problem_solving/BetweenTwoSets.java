package problem_solving;

import java.util.ArrayList;
import java.util.List;

    /*
        O(n log(n)) solution.
        1. find the LCM of all the integers of array A.
        2. find the GCD of all the integers of array B.
        3. Count the number of multiples of LCM that evenly divides the GCD
     */

public class BetweenTwoSets {

    private static final int[] PRIMES = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    public int getTotalX(List<Integer> a, List<Integer> b) {
        // find LCM of all int in a
        int lcm = getLowestCommonMultiple(a);
        // find gcd of all integers in B
        int gcd = getGreatestCommonFactor(b);

        int count = 0;
        for(int i = lcm, j = 2; i <= gcd; i = lcm * j, j++){
            if(gcd % i == 0) {
                count++;
            }
        }

        return count;
    }

    public int getLowestCommonMultiple(List<Integer> input) {
        int multiples = 1;
        for (Integer i : input) {
            multiples *= i;
        }
        return multiples / getGreatestCommonFactor(input);
    }

    public int getGreatestCommonFactor(List<Integer> input) {
        int primePos = 0;
        int gcd = 1;
        while (primePos < PRIMES.length) {
            List<Integer> input1 = new ArrayList<>();
            for (int i = 0; i < input.size(); i++) {
                double a1 = (double) input.get(i) / PRIMES[primePos];
                if (a1 % 1 == 0) {
                    input1.add((int) a1);
                } else {
                    primePos++;
                    break;
                }
            }
            if (input.size() == input1.size()) {
                gcd = gcd * PRIMES[primePos];
                input = input1;
            }
        }
        return gcd;
    }



}
