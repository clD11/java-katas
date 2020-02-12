package problem_solving;

public class AngryProfessorImpl {
    public String angryProfessor(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                if (--k == 0) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
