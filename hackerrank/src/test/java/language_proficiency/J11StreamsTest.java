package language_proficiency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class J11StreamsTest {

    private final J11Streams j11Streams = new J11Streams();

    @Test
    void shouldThrowException() {
        assertThrows(IllegalStateException.class, () -> {
            j11Streams.numPrint();
        });
    }
}