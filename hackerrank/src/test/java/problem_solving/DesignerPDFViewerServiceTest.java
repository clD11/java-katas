package problem_solving;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class DesignerPDFViewerServiceTest {

    private final DesignerPDFViewerService designerPDFViewerService = new DesignerPDFViewerService();

    @Test
    void shouldCalculateLetterAreaZaba() {
        String word = "zaba";
        int[] h = { 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7 };
        int actual = designerPDFViewerService.designerPdfViewer(h, word);
        assertThat(actual, is(28));
    }

    @Test
    void shouldCalculateLetterArea() {
        String word = "abc";
        int[] h = { 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int actual = designerPDFViewerService.designerPdfViewer(h, word);
        assertThat(actual, is(9));
    }
}