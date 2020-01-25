package problem_solving;

import java.util.Scanner;

public class IntroTutorialChallenge {

	public static void findIndex() {
		Scanner scan = new Scanner(System.in);		
		
		int target = Integer.parseInt(scan.nextLine());
		int length = Integer.parseInt(scan.nextLine());
		
		for (int i = 0; i < length; i++) {
			if (scan.nextInt() == target) {
				System.out.println(i);
			}
		}
		
		scan.close();
	}

}
