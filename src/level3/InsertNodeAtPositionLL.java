package level3;

public class InsertNodeAtPositionLL {
	public ListNode insertAtPosition(ListNode head, int data, int pos) {
		ListNode node = new ListNode(data);
		if (head == null) {
			if (pos <= 1) {
				return node;
			} else {
				return head;
			}
		}
		if (head.next == null) {
			if (pos == 2) {
				head.next = node;
				return head;
			}
		}
		if (pos == 1) {
			ListNode temp = head;
			head = node;
			node.next = temp;
		}
		ListNode current = head;
		int count = 1;
		while (current.next != null && ++count < pos) {
			current = current.next;
		}
		if (pos < 0 || pos > count + 1)
			return head;
		ListNode temp = current.next;
		current.next = node;
		node.next = temp;
		return head;
	}
}
