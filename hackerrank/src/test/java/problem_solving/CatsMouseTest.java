package problem_solving;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class CatsMouseTest {

    private final CatsMouse catsMouse = new CatsMouse();

    @Test
    void shouldReturnCatACatchesMouse() {
        int catAPos = 1;
        int catBPos = 2;
        int mousePos = 3;
        String actual = catsMouse.catAndMouse(catAPos, catBPos, mousePos);
        assertThat(actual, is("Cat A"));
    }

    @Test
    void shouldReturnCatBCatchesMouse() {
        int catAPos = 1;
        int catBPos = 4;
        int mousePos = 5;
        String actual = catsMouse.catAndMouse(catAPos, catBPos, mousePos);
        assertThat(actual, is("Cat B"));
    }

    @Test
    void shouldReturnMouseEscapes() {
        int catAPos = 1;
        int catBPos = 3;
        int mousePos = 2;
        String actual = catsMouse.catAndMouse(catAPos, catBPos, mousePos);
        assertThat(actual, is("Mouse C"));
    }

}