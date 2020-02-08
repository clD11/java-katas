package problem_solving;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BonAppetitImplTest {

    private final BonAppetitImpl bonAppetitImpl = new BonAppetitImpl();

    @Test
    void shouldReturnMoneyOwedWhenBillIncorrect() {
        int k = 1;
        int b = 12;
        List<Integer> bill = List.of(3, 10, 2, 9);
        String actual = bonAppetitImpl.calculateBill(bill, k, b);
        assertThat(actual, is(String.valueOf(5)));
    }

    @Test
    void shouldReturnBonAppetitWhenBillCorrect() {
        int k = 1;
        int b = 7;
        List<Integer> bill = List.of(3, 10, 2, 9);
        String actual = bonAppetitImpl.calculateBill(bill, k, b);
        assertThat(actual, is("Bon Appetit"));
    }

    @Test
    void shouldReturnBonAppetitWhenBillCorrectWithZero() {
        int k = 1;
        int b = 7;
        List<Integer> bill = List.of(3, 0, 2, 9);
        String actual = bonAppetitImpl.calculateBill(bill, k, b);
        assertThat(actual, is("Bon Appetit"));
    }
}