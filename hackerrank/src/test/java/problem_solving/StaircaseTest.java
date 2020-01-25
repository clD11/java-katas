package problem_solving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StaircaseTest {

	@Test
	public void printStaircase() {
		String expected = "     #\n    ##\n   ###\n  ####\n #####\n######";
		String actual = Staircase.printStaircase(6);
		assertEquals(expected, actual);
	}
	
}
