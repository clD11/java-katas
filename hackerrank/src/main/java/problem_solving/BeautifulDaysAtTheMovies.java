package problem_solving;

public class BeautifulDaysAtTheMovies {
    public int beautifulDays(int i, int j, int k) {
        int beautifulDays = 0;
        for (int d = i; d <= j; d++) {

            int num = d;
            int reversed = 0;

            while(num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

            if (((double)((d - reversed) * -1) / k) % 1 == 0) {
                beautifulDays++;
            }
        }
        return beautifulDays;
    }
}
