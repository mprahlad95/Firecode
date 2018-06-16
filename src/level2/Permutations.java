package level2;

import java.util.HashMap;
import java.util.Map;

public class Permutations {
	public static boolean permutation(String str1, String str2) {
		if (str1 == null || str2 == null)
			return false;
		if (str1.length() != str2.length())
			return false;
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> map1 = new HashMap<>();
		for (int i = 0; i < str1.length(); i++) {
			if (map.containsKey(str1.charAt(i)))
				map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
			else
				map.put(str1.charAt(i), 1);
			if (map1.containsKey(str2.charAt(i)))
				map1.put(str2.charAt(i), map1.get(str2.charAt(i)) + 1);
			else
				map1.put(str2.charAt(i), 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet())
			if (!(entry.getValue().equals(map1.get(entry.getKey()))))
				return false;
		return true;
	}
}
