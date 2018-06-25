package level3;

public class Palindrome_stringbuilder {
	public static Boolean isIntPalindrome(int x) {            
	    return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
	}
}
