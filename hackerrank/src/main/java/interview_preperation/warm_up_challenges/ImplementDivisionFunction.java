package interview_preperation.warm_up_challenges;

public class ImplementDivisionFunction {


    public int[] divide(int target, int divisor) {
        int divide = 0;
        while (target >= divisor) {
            divide++;
            target -= divisor;
        }
        return new int[] {divide, target};
    }
}
