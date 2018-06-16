package level2;

public class DeleteAtTailCircular {
	public ListNode deleteAtTail(ListNode head) {
		if (head == null)
			return null;
		ListNode current = head;
		while (current.next.next != head) {
			current = current.next;
		}
		current.next = head;
		return head;
	}
}
