package level4;

import java.util.*;

public class LetterCombination_MobileNumber {
	public static ArrayList<String> getStringsFromNums(String digits) {
		String[] data = new String[] { " ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < digits.length(); i++) {
			char[] letters = data[digits.charAt(i) - '0'].toCharArray();
			ArrayList<String> arr1 = new ArrayList<String>();
			if (arr.isEmpty()) {
				arr.add("");
			}
			for (String s : arr) {
				for (int j = 0; j < letters.length; j++) {
					arr1.add(s + letters[j]);
				}
			}
			arr = arr1;
		}
		return arr;
	}
}