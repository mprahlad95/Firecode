package level4;

import java.util.*;

public class CheckBalancedParenthesis_iterative {
	public static boolean isBalanced(String input) {
		if (input.length() < 2)
			return false;
		Stack<Character> s = new Stack<Character>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[')
				s.push(ch);
			else if (ch == ')' || ch == '}' || ch == ']') {
				if (s.isEmpty())
					return false;
				char test = s.pop();
				if (test - ch > 2)
					return false;
			}
		}
		return true;
	}
}
