package hackerrank.problem_solving;

public class BirthdayCandles {

	public static int blow(int[] candles) {
		
		int highest = 0;
		int total = 0;
		
		for (int candle : candles) {
			
			if (candle > highest) {
				highest = candle;
				total = 0;
			}
			
			if (candle >= highest) {
				total++;
			}
		}
		
		return total;
	}

}
