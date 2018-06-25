package level3;

public class RemoveNthfromEndLL {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return null;
		ListNode current = head;
		int length = 0;
		while (current != null) {
			current = current.next;
			length++;
		}
		if (n > length || n <= 0)
			return head;
		current = head;
		int count = 0;
		if (n == length) {
			head = head.next;
		}
		if (current.next == null)
			return null;
		while (current.next != null && count++ < length - n - 1) {
			current = current.next;
		}
		current.next = current.next.next;
		return head;
	}
}
