package interview_preperation.arrays;

public class LeftRotation {

    public int[] rotLeft(int[] a, int d) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int pos = (a.length - d + i) % a.length;
            b[pos] = a[i];
        }
        return b;
    }

    public int[] rotLeftMove(int[] a, int d) {
        int[] b = new int[a.length];
        int moves = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            int pos = i;
            while (moves != d) {
                moves++;
                pos--;
                if (pos < 0) {
                    pos = a.length - 1;
                }
            }
            b[pos] = a[i];
            moves = 0;
        }
        return b;
    }

}
