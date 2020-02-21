package random;

import java.io.InputStream;
import java.util.*;

public class ItemFrequencyService {

    public List<String> getTopName(String filename, int numberOfNames) {
        Map<String, Integer> namesToFrequency = new HashMap<>();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filename);

        try (Scanner scan = new Scanner(inputStream)) {
            while (scan.hasNextLine()) {
                String name = scan.nextLine();
                if (namesToFrequency.containsKey(name)) {
                    namesToFrequency.put(name, namesToFrequency.get(name) + 1);
                } else {
                    namesToFrequency.put(name, 1);
                }
            }
        }

        SortedMap<String, Integer> sortedName =
                new TreeMap<>(new ValueComparator(namesToFrequency));

        sortedName.putAll(namesToFrequency);
        List<String> result = new ArrayList();

        int count = 0;
        for (String key : sortedName.keySet()) {
            if (count >= numberOfNames) {
                break;
            }
            result.add(key);
            count++;
        }

        return result;
    }

    class ValueComparator implements Comparator<String> {
        Map<String, Integer> base;

        public ValueComparator(Map<String, Integer> base) {
            this.base = base;
        }

        public int compare(String a, String b) {
            if (base.get(a) >= base.get(b)) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
