package level2;

public class MaxGain {
	public static int maxGain(int[] a) {
		int min = a[0];
		int max = a[1] - a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] - min > max)
				max = a[i] - min;
			if (a[i] < min)
				min = a[i];
		}
		return max;
	}
}
