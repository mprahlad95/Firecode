package level2;

public class DeleteHeadCircularList {
	public ListNode deleteAtHead(ListNode head) {
		if (head == null || head.next == head)
			return null;
		ListNode current = head;
		head = current.next;
		while (current.next.next != head) {
			current = current.next;
		}
		current.next = head;
		return head;
	}
}
