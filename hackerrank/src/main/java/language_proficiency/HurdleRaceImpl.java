package language_proficiency;

public class HurdleRaceImpl {
    public int hurdleRace(int k, int[] height) {
        int hurdle = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > hurdle) {
                hurdle = height[i];
            }
        }
        return (hurdle - k > 0) ? hurdle - k : 0;
    }
}
