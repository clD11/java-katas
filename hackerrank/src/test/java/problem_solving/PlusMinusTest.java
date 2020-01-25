package problem_solving;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class PlusMinusTest {
	
	@Test
	@Parameters({"3,6,0.500000", "2,6,0.333333", "1,6,0.166667"})
	public void testCalculateFraction(int a, int b, double expected) {
		double actual = PlusMinus.calculateFraction(a, b);
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testCountPositiveNegativeZero() {
		int[] input = new int[] { -4, 3, -9, 0, 4, 1 };		
		int[] actual = PlusMinus.countPostiveNegativeZero(input);
		
		// positive
		assertEquals(3, actual[0], 0);
		
		// negative
		assertEquals(2, actual[1], 0);
		
		// zero
		assertEquals(1, actual[2], 0);		
	}	
}
