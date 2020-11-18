package problem_solving;

public class HappyLadyBugsImpl {

    public String happyLadyBugs(String b) {
        int[] colourFrequencies = new int[28];

        for (char colour : b.toCharArray()) {
            if (colour == '_') {
                colourFrequencies[27]++;
            } else {
                colourFrequencies[colour - 65]++;
            }
        }

        for (int i = 0; i < colourFrequencies.length - 1; i++) {
            if (colourFrequencies[i] == 1) {
                return "NO";
            }
        }

        b = b.replaceAll("_","");

        for (int i = 1; i < b.length() - 1; i++) {
            if (b.charAt(i - 1) != b.charAt(i) && b.charAt(i + 1) != b.charAt(i)) {
                if (colourFrequencies[27] != 0) {
                    return "NO";
                }
                break;
            }
        }

        return "YES";
    }
}
