package problem_solving;

import java.util.Arrays;
import java.util.Comparator;

public class BigSorting {
	
	public static void sort(String[] arr) {		
		Arrays.sort(arr, new Comparator<String>() { 
			public int compare(String str1, String str2) {
	            if (str1.length() == str2.length()) {
	                return str1.compareTo(str2);
	            } else {
	                return str1.length() - str2.length();
	            }
			}
		});	
	}
}
