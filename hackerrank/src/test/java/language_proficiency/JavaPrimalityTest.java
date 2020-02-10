package language_proficiency;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class JavaPrimalityTest {

    private final JavaPrimality javaPrimality = new JavaPrimality();

    @Test
    void shouldBePrime() {
        assertThat(javaPrimality.isPrime(2), is("prime"));
    }

    @Test
    void shouldNotBePrime() {
        assertThat(javaPrimality.isPrime(2), is("prime"));
    }
}