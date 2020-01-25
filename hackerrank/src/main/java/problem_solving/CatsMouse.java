package problem_solving;

import static java.lang.Math.*;

public class CatsMouse {

    public String catAndMouse(int x, int y, int z) {
        int a = abs(z - x);
        int b = abs(z - y);
        if (a == b) {
            return "Mouse C";
        }
        return  (a < b) ? "Cat A" : "Cat B";
    }
}
