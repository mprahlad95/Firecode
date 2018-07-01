package level4;

public class BitSwapping {
	public static int swapOddEvenBits(int x) {
		return ((x & 0xaaaaaaaa) >> 1 | ((x & 0x5555555) << 1));
	}
}
