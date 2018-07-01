package level3;

import java.util.*;

public class MergingRanges {
	public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervalsList) {
		if (intervalsList == null || intervalsList.size() < 2)
			return intervalsList;
		ArrayList<Interval> out = new ArrayList<>();
		Collections.sort(intervalsList, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return Integer.compare(o1.start, o2.start);
			}
		});
		Interval prev = intervalsList.get(0);
		for (int i = 1; i < intervalsList.size(); i++) {
			Interval cur = intervalsList.get(i);
			if (cur.start <= prev.end) {
				prev = new Interval(prev.start, Math.max(cur.end, prev.end));
			} else {
				out.add(prev);
				prev = cur;
			}
		}
			out.add(prev);
			return out;
	}
}
