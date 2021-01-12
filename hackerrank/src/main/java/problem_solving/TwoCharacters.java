package problem_solving;

public class TwoCharacters {

    public int alternate(String input) {
        boolean[] seen = new boolean[26];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (!seen[input.charAt(i) - 97]) {
                if (sb.length() == 0) {
                    sb.append(input.charAt(i));
                } else if (sb.charAt(sb.length() - 1) == input.charAt(i)) {
                    for (int j = 0; j < sb.length(); j++) {
                        if (sb.charAt(j) == input.charAt(i)) {
                            sb.deleteCharAt(j);
                        }
                    }
                    seen[input.charAt(i) - 97] = true;
                } else {
                    sb.append(input.charAt(i));
                }
            }
        }

        return sb.toString().length();
    }
}
