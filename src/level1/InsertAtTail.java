package level1;

public class InsertAtTail {
	public ListNode insertAtTail(ListNode head, int data) {
		ListNode temp = new ListNode(data);
		ListNode current = head;
		if (head == null)
			head = temp;
		else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = temp;
		}
		return head;
	}
}
