package interview_preperation.warm_up_challenges;

import interview_preperation.warm_up_challenges.SockMerchantImpl;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class SockMerchantTest {

    private final SockMerchantImpl sockMerchantImpl = new SockMerchantImpl();

    @Test
    void shouldGetNumberOfPairs() {
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        assertThat(sockMerchantImpl.sockMerchant(n, ar), is(3));
    }

}