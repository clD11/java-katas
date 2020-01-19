package hackerrank.problem_solving;

import java.util.Collections;

public class Staircase {

	public static String printStaircase(int numSteps) {
		StringBuilder str = new StringBuilder();				
		
		for (int i = 1; i <= numSteps; i++) {			
			str.append(String.join("", Collections.nCopies(numSteps - i, " ")))
			   .append(String.join("", Collections.nCopies(i, "#")))
			   .append("\n");	
		}
		
		str.setLength(str.length() - 1);
		
		return str.toString();
	}
	
	public static String printStaircase2(int numSteps) {
		StringBuilder str = new StringBuilder();				
		
		for (int i = 1; i <= numSteps; ++i) {
			for (int j = numSteps; j > 0; --j) {				
				if (j > i) {
					str.append(" ");
				} else {
					str.append("#");
				}
			}			
			str.append("\n");
		}
		
		str.setLength(str.length() - 1);
		
		return str.toString();
	}
}
