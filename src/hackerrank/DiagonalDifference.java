package hackerrank;

import java.util.Scanner;

public class DiagonalDifference {

	public int[][] inputReader() {
		Scanner scanner = new Scanner(System.in);		
		
		int dimension = Integer.parseInt(scanner.nextLine());
		int[][] input = new int[dimension][dimension];		
		
		for (int i = 0; i < dimension; i++) {			
			String[] nums = scanner.nextLine().split(" ");			
			
			for (int j = 0; j < dimension; j++) {
				input[i][j] = Integer.parseInt(nums[j]);
			}
		}
		
		scanner.close();
		
		return input;
	}
	
	public int sumDiagonalDifference(int[][] arr) {		
		
		int diagonalLeft = 0;
		int diagonalRight = 0;
		
		int len = arr.length - 1;
		
		for (int i = 0; i < arr.length; i++) {
			diagonalLeft += arr[i][i];
			diagonalRight += arr[i][len - i];
		}
		
		return Math.abs(diagonalRight - diagonalLeft);		
	}	
}