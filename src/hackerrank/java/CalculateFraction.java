package hackerrank.java;

import java.util.ArrayList;
import java.util.List;

public class CalculateFraction {

    List<Trade> publicTrades = new ArrayList<>();
    List<Trade> privateTrades = new ArrayList<>();

    public void onPublicTrade(int price, int quantity, long timestampMilliseconds) {
        publicTrades.add(new Trade(price, quantity, timestampMilliseconds));
    }

    public void onPrivateTrade(int price, int quantity, long timestampMilliseconds) {
        privateTrades.add(new Trade(price, quantity, timestampMilliseconds));
    }

    public Double calculateFraction() {
     //   List<Trade[]> pairs
        return Double.NaN;
    }

    private class Trade {
        private final int price;
        private final int quantity;
        private final long timestampMilliseconds;

        public Trade(int price, int quantity, long timestampMilliseconds) {
            this.price = price;
            this.quantity = quantity;
            this.timestampMilliseconds = timestampMilliseconds;
        }

        public int getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public long getTimestampMilliseconds() {
            return timestampMilliseconds;
        }
    }
}
