package hackerrank.java;

//If  is odd, print Weird
//        If  is even and in the inclusive range of  to , print Not Weird
//        If  is even and in the inclusive range of  to , print Weird
//        If  is even and greater than , print Not Weird

import java.util.Scanner;

public class IfElse {

    private static String WEIRD = "Weird";
    private static String NOT_WEIRD = "Not Weird";

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            while (scan.hasNext()) {
                System.out.println(task(scan.nextInt()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String task(int n) {

        if (n % 2 == 1) {
            return WEIRD;
        }

        if (n % 2 == 0 && n >= 2 && n <= 5) {
            return NOT_WEIRD;
        }

        if (n % 2 == 0 && n >= 6 && n <= 20) {
            return WEIRD;
        }

        if (n % 2 == 0 && n > 20) {
            return NOT_WEIRD;
        }

        return "";
    }

}
