package level4;

import java.util.*;

public class LongestNonRepeatingSubstring_bruteforce {
	public static int longestNRSubstringLen(String input) {
		if (input == null)
			return 0;
		int len = input.length(), max = 0;
		for (int start = 0; start < len; start++) {
			for (int end = start + 1; end <= len; end++) {
				if (isUnique(input, start, end))
					max = Math.max(max, end - start);
			}
		}
		return max;
	}

	public static boolean isUnique(String subString, int start, int end) {
		HashSet<Character> set = new HashSet<>();
		for (int i = start; i < end; i++) {
			char ch = subString.charAt(i);
			if (set.contains(ch))
				return false;
			set.add(ch);
		}
		return true;
	}
}
