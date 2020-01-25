package problem_solving;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class StaircaseTest {

	@Test
	public void printStaircase() {
		String expected = "     #\n    ##\n   ###\n  ####\n #####\n######";
		String actual = Staircase.printStaircase(6);
		assertEquals(expected, actual);
	}
	
}
