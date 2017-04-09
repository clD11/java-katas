package mengenlehreuhr.core;

public class BerlinClock implements Clock {

	public String convertTime(final int hours, final int minutes, final int seconds) {
		StringBuilder time = new StringBuilder();

		time.append(toggleSecondLamps(seconds)).append("\n");
		time.append(toggleFiveHourLamps(hours)).append("\n");
		time.append(toggleSingleHourLamps(hours)).append("\n");
		time.append(toggleFiveMinuteLamps(minutes)).append("\n");
		time.append(toggleSingleMinutesLamps(minutes));

		return time.toString();
	}

	private String toggleFiveHourLamps(final int hours) {
		return toggleLamps(4, getOnDiv(hours), "R");
	}

	private String toggleSingleHourLamps(final int hours) {
		return toggleLamps(4, getOnMod(hours), "R");
	}

	private String toggleFiveMinuteLamps(final int minutes) {
		return toggleLamps(11, getOnDiv(minutes), "Y").replaceAll("YYY", "YYR");
	}

	private String toggleSingleMinutesLamps(final int minutes) {
		return toggleLamps(4, getOnMod(minutes), "Y");
	}

	private String toggleSecondLamps(final int seconds) {
		return (seconds % 2 == 0) ? "Y" : "O";
	}

	private int getOnDiv(int num) {
		return num / 5;
	}

	private int getOnMod(int num) {
		return num % 5;
	}

	private String toggleLamps(final int lamps, final int on, final String colour) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < on; i++) {
			result.append(colour);
		}

		for (int i = 0; i < lamps - on; i++) {
			result.append("O");
		}

		return result.toString();
	}
}