package level3;

public class HappyNumber {
	public static boolean isHappyNumber(int n) {
		int count = 1;
		while (n > 3 && count++ < 10) {
			int sum = 0;
			while (n > 0) {
				int digit = n % 10;
				sum += digit * digit;
				n /= 10;
			}
			n = sum;
		}
		return (n == 1);
	}
}
