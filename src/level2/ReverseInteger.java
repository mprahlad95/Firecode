package level2;

public class ReverseInteger {
	public static int reverseInt(int x) {
		int n = 0;
		while (x != 0) {
			n = n * 10 + x % 10;
			x /= 10;
		}
		return n;
	}
}
