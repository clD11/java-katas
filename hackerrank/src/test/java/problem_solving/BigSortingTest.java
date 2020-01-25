package problem_solving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BigSortingTest {

	@Test
	void testSort() {
		
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
