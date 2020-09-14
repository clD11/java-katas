package problem_solving;

public class AppleAndOrange {

    public int[] countApplesAndOrangesImp(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int[] fruit = new int[2];

        for (int i = 0; i < apples.length; i++) {
            if (isRange(a + (apples[i]), s, t)) {
                fruit[0]++;
            }
        }

        for (int i = 0; i < oranges.length; i++) {
            if (isRange(b + (oranges[i]), s, t)) {
                fruit[1]++;
            }
        }

        System.out.println(fruit[0] + "\n" + fruit[1]);
        return fruit;
    }

    private boolean isRange(int a, int s, int t) {
        return a >= s && a <= t;
    }

}