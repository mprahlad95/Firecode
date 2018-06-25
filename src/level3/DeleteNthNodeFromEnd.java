package level3;

import java.util.HashMap;
import java.util.Map;

public class DeleteNthNodeFromEnd {
	public ListNode findNthNodeFromEnd(ListNode head, int n) {
		HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();
		if (head == null)
			return null;
		int length = 0;
		ListNode current = head;
		while (current != null) {
			map.put(current, length++);
			System.out.println(length);
			current = current.next;
		}
		if (n <= 0 || n > length)
			return null;
		for (Map.Entry<ListNode, Integer> entry : map.entrySet()) {
			if (entry.getValue() == (length - n))
				return entry.getKey();
		}
		return null;
	}
}
