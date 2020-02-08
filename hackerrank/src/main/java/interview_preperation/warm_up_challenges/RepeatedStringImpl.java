package interview_preperation.warm_up_challenges;

public class RepeatedStringImpl {

    public long repeatedString(String s, long n) {
        long occurrence = s.chars().filter(c -> c == 'a').count();
        long remainder = n % s.length();
        long whole = n - remainder;
        long repetition = whole / s.length() * occurrence;
        repetition += s.substring(0, (int) remainder).chars().filter(c -> c == 'a').count();
        return repetition;
    }
}
