package hackerrank.problem_solving;

public class TimeConversion {

	public static String convert(String time) {
		
		String converted = time.substring(0, 8);		
		int hour = Integer.parseInt(time.substring(0, 2));
		
		if (hour == 12 && time.endsWith("AM")) {			
			return converted.replaceFirst("12", "00");
		}
		
		if (hour != 12 && time.endsWith("PM")) {			
			return (hour + 12) + converted.substring(2, 8);
		}
		
		return converted;
	}
}