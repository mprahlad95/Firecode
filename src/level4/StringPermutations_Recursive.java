package level4;

import java.util.*;

public class StringPermutations_Recursive {
	public static ArrayList<String> getPermutations(String s) {
		ArrayList<String> arr1 = new ArrayList<String>();
		if (s == null)
			return null;
		else if (s.length() == 0) {
			arr1.add("");
			return arr1;
		}
		char ch = s.charAt(0);
		String s1 = s.substring(1);
		ArrayList<String> arr2 = getPermutations(s1);
		System.out.println(arr2);
		for (String s2 : arr2) {
			for (int i = 0; i <= s2.length(); i++) {
				arr1.add(s2.substring(0, i) + ch + s2.substring(i));
				System.out.println(arr1);
			}
		}
		return arr1;
	}
	public static void main(String[] args) {
		System.out.println(getPermutations("abcdef"));
	}
}
