package level1;

public class StringPalindrome {
	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.

	public static boolean isStringPalindrome(String str) {
		String s = "";
		if (str == null)
			return true;
		for (int i = str.length() - 1; i >= 0; i--)
			s = s + str.charAt(i);
		if (str.equals(s))
			return true;
		else
			return false;
	}
}
