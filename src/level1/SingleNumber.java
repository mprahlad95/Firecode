package level1;
import java.util.HashMap;
import java.util.Map.Entry;

public class SingleNumber {

	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.

	public static int singleNumber(int[] A) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i]))
				map.put(A[i], map.get(A[i]) + 1);
			else
				map.put(A[i], 1);
		}
		int res = 0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				res = entry.getKey();
				break;
			}
		}
		return res;
	}
}
