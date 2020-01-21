package hackerrank.problem_solving;

import static org.junit.Assert.assertEquals;

import hackerrank.problem_solving.DiagonalDifference;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class DiagonalDifferenceTest {

	private DiagonalDifference testee;
	
	@Before
	public void setup() {
		testee = new DiagonalDifference();
	}
	
	@Test
	public void testDiagonalDifference() {		
		int[][] arr = new int[][] { {11, 2, 4 }, {4, 5, 6 }, { 10, 8, -12 } };		
		int actual = testee.sumDiagonalDifference(arr);
		assertEquals(15, actual);
	}
}