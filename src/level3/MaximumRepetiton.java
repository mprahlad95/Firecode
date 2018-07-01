package level3;

import java.util.*;

public class MaximumRepetiton {
	public static int getMaxRepetition(int[] a) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i]))
				map.put(a[i], map.get(a[i]) + 1);
			else
				map.put(a[i], 1);
		}
		int max = Collections.max(map.values());
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max)
				return entry.getKey();
		}
		return 0;
	}
}
