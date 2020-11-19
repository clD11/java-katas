package problem_solving;

public class DesignerPDFViewerService {

    public int designerPdfViewer(int[] h, String word) {
        int tallest = 0;
        for (int i = 0; i < word.length(); i++) {
            int height = h[word.charAt(i) - 97];
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest * word.length();
    }
}
