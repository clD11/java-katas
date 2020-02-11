package problem_solving;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ElectronicsShop {
    public int getMoneySpentNaive(List<Integer> keyboards, List<Integer> devices, int b) {
        int highest = -1;
        for (int i = 0; i < keyboards.size(); i++) {
            for (int j = 0; j < devices.size(); j++) {
                int total = keyboards.get(i) + devices.get(j);
                if (total <= b && total > highest) {
                    highest = total;
                }
            }
        }
        return highest;
    }

    public int getMoneySpent(List<Integer> keyboards, List<Integer> drives, int b) {
        keyboards.sort(Collections.reverseOrder());//Descending order
        Collections.sort(drives);//Ascending order
        int max = -1;
        for(int i = 0, j = 0; i < keyboards.size(); i++){
            for(; j < drives.size(); j++){
                if(keyboards.get(i) + drives.get(j) > b) break;
                if(keyboards.get(i) + drives.get(j) > max)
                    max = keyboards.get(i) + drives.get(j);
            }
        }
        return max;
    }
}
