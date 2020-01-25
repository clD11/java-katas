package problem_solving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BirthdayCakeCandlesTest {

	@Test
	void testCandlesBlownOut() {
		int actual = BirthdayCandles.blow(new int[] { 3, 2, 1, 3 });
		assertEquals(2, actual);
	}	
}
