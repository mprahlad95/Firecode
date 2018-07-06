package level4;

import java.util.*;

public class StringPerm_Comb_Iterative {
	public static ArrayList<String> getCombPerms(String s) {
		if (s == null || s.length() == 0)
			return null;
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("");
		for (char ch : s.toCharArray()) {
			ArrayList<String> arr1 = new ArrayList<String>();
			for (String s1 : arr) {
				for (int i = 0; i <= s1.length(); i++) {
					arr1.add(s1.substring(0, i) + ch + s1.substring(i));
				}
			}
			arr.addAll(arr1);
		}
		arr.remove(0);
		return arr;
	}
}
