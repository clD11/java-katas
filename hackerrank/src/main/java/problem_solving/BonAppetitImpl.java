package problem_solving;

import java.util.List;

public class BonAppetitImpl {

    public void printBonAppetit(List<Integer> bill, int k, int b) {
        System.out.println(calculateBill(bill, k, b));
    }

    public String calculateBill(List<Integer> bill, int k, int b) {
        int total = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                total = total + bill.get(i);
            }
        }

        int owed = total / 2;
        if (b != owed) {
            return String.valueOf(b - owed);
        }

        return "Bon Appetit";
    }

}
