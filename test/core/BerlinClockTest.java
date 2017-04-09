package core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import core.BerlinClock;
import core.Clock;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class BerlinClockTest {
	Clock clock;

	@Before
	public void setup() {
		clock = new BerlinClock();
	}

	@Test
	@Parameters({ "0,0,0,Y\nOOOO\nOOOO\nOOOOOOOOOOO\nOOOO", "5,0,0,Y\nROOO\nOOOO\nOOOOOOOOOOO\nOOOO",
			"5,1,0,Y\nROOO\nOOOO\nOOOOOOOOOOO\nYOOO", "5,7,0,Y\nROOO\nOOOO\nYOOOOOOOOOO\nYYOO",
			"10,17,0,Y\nRROO\nOOOO\nYYROOOOOOOO\nYYOO", "5,17,1,O\nROOO\nOOOO\nYYROOOOOOOO\nYYOO",
			"7,17,1,O\nROOO\nRROO\nYYROOOOOOOO\nYYOO", "23,54,16,Y\nRRRR\nRRRO\nYYRYYRYYRYO\nYYYY" })
	public void testConvertToBerlinTime(int hours, int minutes, int seconds, String expected) {
		String actual = clock.convertTime(hours, minutes, seconds);

		assertEquals(expected, actual);
	}
}
