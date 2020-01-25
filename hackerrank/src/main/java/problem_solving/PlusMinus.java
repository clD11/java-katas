package problem_solving;

import java.util.Scanner;

public class PlusMinus {

	public static void run() {		
		Scanner scan = new Scanner(System.in);		
		
		try {
			
			int length = Integer.parseInt(scan.nextLine());		
			int[] input = new int[length];
			
			for (int i = 0; i < length && scan.hasNextInt(); i++) {
				input[i] = scan.nextInt();
			}
			
			int[] summed = countPostiveNegativeZero(input);
			
			for (int sum : summed) {
				System.out.println(calculateFraction(sum, length));
			}
			
		} finally {
			scan.close();
		}
	}
	
	public static int[] countPostiveNegativeZero(int[] input) {
		
		int[] count = new int[] { 0, 0, 0 };
		
		for (int num : input) {		
			if (num > 0) {
				count[0]++;
			} else if (num < 0){
				count[1]++;
			} else {
				count[2]++;
			}
		}
		
		return count;
	}

	public static double calculateFraction(int a, int b) {
		return Math.round(a / (double) b * 1000000.0) / 1000000.0;
	}
}
