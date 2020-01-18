package hackerrank.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CalculateFraction {

    private final List<Trade> pubTrades = new ArrayList<>();
    private final List<Trade> priTrades = new ArrayList<>();

    public void onPublicTrade(int price, int quantity, long timestampMilliseconds) {
        pubTrades.add(new Trade(price, quantity, timestampMilliseconds));
    }

    public void onPrivateTrade(int price, int quantity, long timestampMilliseconds) {
        priTrades.add(new Trade(price, quantity, timestampMilliseconds));
    }

    public Double calculateFraction() {
        pubTrades.removeIf(t -> !priTrades.contains(t));
        priTrades.removeIf(t -> !pubTrades.contains(t));

        BigDecimal pubTotal = new BigDecimal(pubTrades.stream().mapToDouble(t -> t.getPrice() * t.getQuantity()).sum());
        BigDecimal priTotal = new BigDecimal(pubTrades.stream().mapToDouble(t -> t.getPrice() * t.getQuantity()).sum());

        if (pubTrades.isEmpty() && priTrades.isEmpty()) {
            return Double.NaN;
        }

        return pubTotal.divide(priTotal).doubleValue();
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Trade trade = (Trade) o;
            return price == trade.price &&
                   timestampMilliseconds == trade.timestampMilliseconds;
        }

        @Override
        public int hashCode() {
            return Objects.hash(price, timestampMilliseconds);
        }
    }
}
