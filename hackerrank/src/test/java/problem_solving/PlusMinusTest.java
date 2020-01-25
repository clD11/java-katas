package problem_solving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlusMinusTest {

	@Test
	void testCalculateFraction() {
		double actual = PlusMinus.calculateFraction(3, 6);
		assertEquals(0.500000, actual, 0);
	}
	
	@Test
	void testCountPositiveNegativeZero() {
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
