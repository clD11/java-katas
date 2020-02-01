package problem_solving;

public class DrawingBook {

    public int pageCount(int n, int p) {
        if (p <= (n / 2)) {
            return p / 2;
        }
        return ((n - p) + (1 - n % 2)) / 2;
    }
}