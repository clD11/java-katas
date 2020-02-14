package problem_solving;

public class CircularArrayRotationImpl {
    public int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] temp = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int pos = (i + k) % a.length;
            temp[pos] = a[i];
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = temp[queries[i]];
        }
        return result;
    }

}
