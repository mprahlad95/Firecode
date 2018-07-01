package level3;

public class CountPathsRecursion {
	public int countPaths(int m, int n) {
		if (m == 1 || n == 1)
			return 1;
		return countPaths(m - 1, n) + countPaths(m, n - 1);
	}
}
