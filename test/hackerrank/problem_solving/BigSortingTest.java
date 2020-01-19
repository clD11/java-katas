package hackerrank.problem_solving;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;

@RunWith(JUnitParamsRunner.class)
public class BigSortingTest {

	@Test
	public void testSort() {
		
		String a = "31415926535897932384626433832795";
		String b = "1";
		String c = "3";
		String d = "10";
		String e = "3";
		String f = "5";
		
		String[] arr = new String[] { a, b, c, d, e, f };
		
		BigSorting.sort(arr);
		
		assertArrayEquals(new String[] { b, c, e, f, d, a }, arr);
	}
	
}
