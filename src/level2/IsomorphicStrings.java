package level2;

import java.util.*;

public class IsomorphicStrings {
	public static boolean isIsomorphic(String input1, String input2) {
		if (input1.length() != input2.length())
			return false;
		Map<Character, Character> freq1 = new HashMap<>();
		Map<Character, Character> freq2 = new HashMap<>();
		for (int i = 0; i < input1.length(); i++) {
			char c1 = input1.charAt(i);
			char c2 = input2.charAt(i);
			if (!freq1.containsKey(c1))
				freq1.put(c1, c2);
			if (!freq2.containsKey(c2))
				freq2.put(c2, c1);
			if (freq1.get(c1) != c2 || freq2.get(c2) != c1)
				return false;
		}
		return true;
	}
}
