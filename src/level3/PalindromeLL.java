package level3;

import java.util.*;

public class PalindromeLL {
	public Boolean isListPalindrome(ListNode head) {
		if (head == null)
			return true;
		ListNode current = head;
		Stack<ListNode> s = new Stack<ListNode>();
		while (current != null) {
			s.push(current);
			current = current.next;
		}
		current = head;
		while (current != null) {
			ListNode temp = s.pop();
			if (temp.data != current.data)
				return false;
			current = current.next;
		}
		return true;
	}
}
