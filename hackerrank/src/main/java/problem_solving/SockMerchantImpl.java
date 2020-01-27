package problem_solving;

public class SockMerchantImpl {

    private final int[] count = new int[101];

    public int sockMerchant(int n, int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            int s = ar[i];
            count[s]++;
        }
        int pairs = 0;
        for (int i = 0; i < count.length; i++) {
            int num = count[i];
            if (num > 0) {
                if (num % 2 != 0) {
                    num--;
                }
                pairs += num / 2;
            }
        }
        return pairs;
    }
}
