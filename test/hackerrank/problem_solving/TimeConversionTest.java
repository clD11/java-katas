package hackerrank.problem_solving;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TimeConversionTest {

	@Test
	@Parameters({"12:00:00AM,00:00:00", "12:05:05AM,00:05:05", "12:05:05PM,12:05:05",
				 "07:05:45PM,19:05:45", "07:05:45AM,07:05:45"})
	public void testConvertTime(String input, String expected) {
		String actual = TimeConversion.convert(input);
		assertEquals(expected, actual);
	}
}
