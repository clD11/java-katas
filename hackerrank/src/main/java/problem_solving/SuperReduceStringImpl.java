package problem_solving;

public class SuperReduceStringImpl {

    public String superReducedString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (sb.length() == 0) {
                sb.append(s.charAt(i));
            } else if (sb.charAt(sb.length() - 1) == s.charAt(i)) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return (sb.length() == 0) ? "Empty String" : sb.toString();
    }

}