package problem_solving;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiagonalDifferenceTest {

	private DiagonalDifference diagonalDifference;
	
	@BeforeEach
	void setup() {
		diagonalDifference = new DiagonalDifference();
	}
	
	@Test
	void testDiagonalDifference() {
		int[][] arr = new int[][] { {11, 2, 4 }, {4, 5, 6 }, { 10, 8, -12 } };		
		int actual = diagonalDifference.sumDiagonalDifference(arr);
		assertEquals(15, actual);
	}
}
