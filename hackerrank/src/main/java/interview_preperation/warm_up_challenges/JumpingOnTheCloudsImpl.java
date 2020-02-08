package interview_preperation.warm_up_challenges;

public class JumpingOnTheCloudsImpl {

    public int jumpingOnTheClouds(int[] c) {
        int lastCloud = c.length - 1;
        int currentCloud = 0;
        int jumps = 0;

        while (currentCloud != lastCloud) {
            if (currentCloud + 2 > lastCloud || c[currentCloud + 2] == 1) {
                currentCloud = currentCloud + 1;
            } else {
                currentCloud = currentCloud + 2;
            }
            jumps++;
        }

        return jumps;
    }
}
