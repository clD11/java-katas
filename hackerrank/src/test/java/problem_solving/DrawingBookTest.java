package problem_solving;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

class DrawingBookTest {

    private final DrawingBook drawingBook = new DrawingBook();

    @Test
    void shouldReturnPageCountFrontPage() {
        int n = 10;
        int p = 1;
        assertThat(drawingBook.pageCount(n, p), Matchers.is(0));
    }

    @Test
    void shouldReturnPageCountBackPage() {
        int n = 8;
        int p = 8;
        assertThat(drawingBook.pageCount(n, p), Matchers.is(0));
    }

    @Test
    void shouldReturnPageCountFrontBookEven() {
        int n = 6;
        int p = 2;
        assertThat(drawingBook.pageCount(n, p), Matchers.is(1));
    }

    @Test
    void shouldReturnPageCountFrontBookOdd() {
        int n = 9;
        int p = 3;
        assertThat(drawingBook.pageCount(n, p), Matchers.is(1));
    }

    @Test
    void shouldReturnPageCountBackBook() {
        int n = 5;
        int p = 4;
        assertThat(drawingBook.pageCount(n, p), Matchers.is(0));
    }

    @Test
    void shouldReturnPageCountMiddleBook() {
        int n = 7;
        int p = 4;
        assertThat(drawingBook.pageCount(n, p), Matchers.is(1));
    }

    @Test
    void shouldReturnPageCountBackOne() {
        int n = 6;
        int p = 5;
        assertThat(drawingBook.pageCount(n, p), Matchers.is(1));
    }

    @Test
    void shouldReturnPageCountMiddleEven() {
        int n = 6;
        int p = 3;
        assertThat(drawingBook.pageCount(n, p), Matchers.is(1));
    }
}