package problem_solving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeConversionTest {

	@Test
	void testConvertTime() {
		String actual = TimeConversion.convert("12:00:00AM");
		assertEquals("00:00:00", actual);
	}
}
