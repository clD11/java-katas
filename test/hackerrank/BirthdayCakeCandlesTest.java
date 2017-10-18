package hackerrank;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class BirthdayCakeCandlesTest {

	@Test
	public void testCandlesBlownOut() {
		int actual = BirthdayCandles.blow(new int[] { 3, 2, 1, 3 });
		assertEquals(2, actual);
	}	
}
