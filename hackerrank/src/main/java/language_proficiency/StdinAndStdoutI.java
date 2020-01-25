package language_proficiency;

import java.util.Scanner;

public class StdinAndStdoutI {

    public void printOutput() {
        try (Scanner scan = new Scanner(System.in)) {
            while (scan.hasNext()) {
                System.out.println(scan.nextInt());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
