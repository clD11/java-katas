package hackerrank.problem_solving;

public class KangarooSolution {

    public String kangaroo(int x1, int v1, int x2, int v2) {
        if (x2 > x1 && v2 > v1) {
            return "NO";
        }

        while (x1 != x2) {
            x1 += v1;
            x2 += v2;
            if (x1 > x2 && v1 >= v2) {
                return "NO";
            }
        }
        return "YES";
    }

    public String kangarooRec(int x1, int v1, int x2, int v2) {
        if (x2 > x1 && v2 > v1) {
            return "NO";
        }

        x1 += v1;
        x2 += v2;

        if (x1 > x2 && v1 >= v2) {
            return "NO";
        }

        if (x1 == x2) {
            return "YES";
        }

        return kangarooRec(x1, v1, x2, v2);
    }
}