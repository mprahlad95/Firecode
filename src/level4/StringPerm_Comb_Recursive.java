package level4;

import java.util.*;

public class StringPerm_Comb_Recursive {
	public static ArrayList<String> getCombPerms(String s) {
		ArrayList<String> arr1 = new ArrayList<String>();
		if (s == null)
			return null;
		else if (s.length() == 1) {
			arr1.add(s);
			return arr1;
		}
		char ch = s.charAt(0);
		arr1.add(Character.toString(ch));
		String s1 = s.substring(1);
		ArrayList<String> arr2 = getCombPerms(s1);
		for (String s2 : arr2) {
			for (int i = 0; i <= s2.length(); i++) {
				arr1.add(s2.substring(0, i) + ch + s2.substring(i));
			}
		}
		arr1.addAll(arr2);
		return arr1;
	}
}
