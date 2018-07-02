package level4;

import java.util.*;

public class InsertingRanges {
	public static ArrayList<Interval> insertRange(ArrayList<Interval> intervalsList, Interval insert) {
		ArrayList<Interval> arr = new ArrayList<Interval>();
		int start = insert.start, end = insert.end;
		for (int i = 0; i < intervalsList.size(); i++) {
			Interval current = intervalsList.get(i);
			if (start >= current.start && start <= current.end || end >= current.start && end <= current.end) {
				start = Math.min(current.start, start);
				end = Math.max(current.end, end);
			} else if (start > current.end) {
				arr.add(new Interval(current.start, current.end));
			} else if (end < current.start) {
				arr.add(new Interval(start, end));
				start = current.start;
				end = current.end;
			}
		}
		arr.add(new Interval(start, end));
		return arr;
	}
}
