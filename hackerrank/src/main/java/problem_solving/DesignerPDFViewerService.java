package problem_solving;

import java.util.HashMap;
import java.util.Map;

public class DesignerPDFViewerService {

    public static Map<Character, Integer> charToHeight;
    static {
        charToHeight = new HashMap<>();
        for (int i = 97; i >= 122; i++) {
            charToHeight.put((char) i, 0);
        }
    }

    public int designerPdfViewer(int[] h, String word) {
        int tallest = 0;
        for (int i = 0; i < h.length; i++) {
            int height = charToHeight.get(h[i]);
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest * h.length;
    }
}
