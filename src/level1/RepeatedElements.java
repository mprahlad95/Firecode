package level1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class RepeatedElements {
	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.

	public static String duplicate(int[] numbers){
			HashMap<Integer, Integer> map = new HashMap<>();
			TreeSet tree = new TreeSet();
			for (int i = 0; i < numbers.length; i++) {
				if (map.containsKey(numbers[i]))
					map.put(numbers[i], map.get(numbers[i]) + 1);
				else
					map.put(numbers[i], 1);
			}
			int res = 0;
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue() > 1) {
					res = entry.getKey();
					tree.add(res);
				}
			}
			return tree.toString();
		}
}
