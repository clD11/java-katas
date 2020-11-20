package problem_solving;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {

    private static final int[] PRIMES = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };

    public List<Integer> getPrimeFactors(int num) {
        List<Integer> primeFactors = new ArrayList<>();

        int primePos = 0;
        while (num > 0 && num != PRIMES[primePos]) {
            double div = (double) num / PRIMES[primePos];
            if (div % 1 == 0) {
                primeFactors.add(PRIMES[primePos]);
                num = (int) div;
            } else {
                primePos++;
            }
        }
        primeFactors.add(PRIMES[primePos]);

        return primeFactors;
    }
}
