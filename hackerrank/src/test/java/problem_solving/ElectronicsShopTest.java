package problem_solving;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ElectronicsShopTest {

    private final ElectronicsShop electronicsShop = new ElectronicsShop();

    @Test
    void shouldFindHighestPriceA() {
        int b = 10;
        List<Integer> keyboards = newArrayList(3, 1);
        List<Integer> devices = newArrayList(5, 2, 8);

        Integer actual = electronicsShop.getMoneySpent(keyboards, devices, b);
        assertThat(actual, is(9));
    }

    @Test
    void shouldNotBeAbleToBuyItems() {
        int b = 5;
        List<Integer> keyboards = newArrayList(4);
        List<Integer> devices = newArrayList(5);
        Integer actual = electronicsShop.getMoneySpent(keyboards, devices, b);
        assertThat(actual, is(-1));
    }

    // Hackerrank test bug where Long is in file should be all int

//    @Test
//    void shouldFindHighestPriceB() {
//        int b = 374625;
//        var multiList = readLine("electronic-shop.txt");
//
//        List<Integer> keyboards = multiList.get(0);
//        List<Integer> devices = multiList.get(1);
//
//        Integer actual = electronicsShop.getMoneySpent(keyboards, devices, b);
//        assertThat(actual, is(374625L));
//    }
//
//
//
//    private List<List<Integer>> readLine(String filename) {
//        var inputStream = getClass().getClassLoader().getResourceAsStream(filename);
//        var multiList = new ArrayList<List<Integer>>();
//        try (var scanner = new Scanner(inputStream)) {
//           while (scanner.hasNextLine()) {
//               String line = scanner.nextLine();
//               if (!line.startsWith("##")) {
//                   var result = new ArrayList<Integer>();
//                   for (String n : line.split("\\s")) {
//                       result.add(Integer.parseInt(n));
//                   }
//                   multiList.add(result);
//               }
//            }
//        }
//        return multiList;
//    }
}