package problem_solving;

public class CamelCaseImpl {

    public static int camelCase(String s) {
        int count = 1;
        for (char c : s.toCharArray()) {
            if (c >= 65 && c <= 90) {
                count++;
            }
        }
        return count;
    }
}