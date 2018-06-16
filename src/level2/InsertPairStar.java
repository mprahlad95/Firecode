package level2;

public class InsertPairStar {
	public static String insertPairStar(String s) {
		if (s == null || s.length() == 1)
			return s;
		if (s.substring(0, 1).equals(s.substring(1, 2)))
			return s.substring(0, 1) + "*" + insertPairStar(s.substring(1, s.length()));
		return s.substring(0, 1) + insertPairStar(s.substring(1, s.length()));
	}
}
