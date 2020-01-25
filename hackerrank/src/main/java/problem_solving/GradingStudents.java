package problem_solving;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GradingStudents {

    private final TreeMap<Integer, Integer> range = new TreeMap<>();

    public GradingStudents() {
        for (int i = 0; i <= 100; i += 5) {
            range.put(i, i);
        }
    }

    public List<Integer> gradingStudentsMap(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade >= 38) {
                int closest = range.ceilingKey(grade);
                if (closest - grade <= 2) {
                    grade = closest;
                }
            }
            result.add(grade);
        }
        return result;
    }

    public List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (int grade : grades) {
            if (grade >= 38) {
                int dif = 0;
                while (dif < 3) {
                    if ((grade + dif) % 5 == 0) {
                        grade += dif;
                        break;
                    }
                    dif++;
                }
            }
            result.add(grade);
        }
        return result;
    }
}
