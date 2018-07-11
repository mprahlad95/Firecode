package level4;

public class ReverseLLinPairs {
	public ListNode reverseInPairs(ListNode head) {
		if (head == null)
			return null;
		ListNode current = head;
		while (current != null && current.next != null) {
			swap(current, current.next);
			current = current.next.next;
		}
		return head;
	}

	public void swap(ListNode l1, ListNode l2) {
		int temp = l1.data;
		l1.data = l2.data;
		l2.data = temp;
	}
}
