package level3;

import java.util.*;

public class RemoveDuplicateNodesLL {
	public ListNode removeDuplicates(ListNode head) {
		if (head == null)
			return null;
		ListNode current = head, prev = null;
		HashSet<Integer> map = new HashSet<Integer>();
		while (current != null) {
			if (map.contains(current.data)) {
				prev.next = current.next;
			} else {
				map.add(current.data);
				prev = current;
			}
			current = current.next;
		}
		return head;
	}
}
