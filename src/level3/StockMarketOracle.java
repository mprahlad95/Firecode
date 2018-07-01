package level3;

public class StockMarketOracle {
	public static int maxProfit(int[] a) {
		int profit = 0;
		for (int i = 0; i < a.length - 1; i = i + 2) {
			int diff = a[i + 1] - a[i];
			if (diff > 0)
				profit = profit + diff;
		}
		return (profit > 0) ? profit : 0;
	}
}
