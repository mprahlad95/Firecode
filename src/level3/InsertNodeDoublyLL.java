package level3;

public class InsertNodeDoublyLL {
	public DoublyLinkedNode insertAtPos(DoublyLinkedNode head, int data, int pos) {
		DoublyLinkedNode node = new DoublyLinkedNode(data);
		if (head == null) {
			if (pos == 1)
				return node;
			else
				return null;
		}
		if (head.next == null && pos == 2) {
			head.next = node;
			return head;
		}
		if (pos == 1) {
			node.next = head;
			return node;
		}
		DoublyLinkedNode current = head;
		int count = 1;
		while (current.next != null && ++count < pos) {
			current = current.next;
		}
		if (pos > count + 1 || pos < 1)
			return head;
		DoublyLinkedNode temp = current.next;
		current.next = node;
		node.next = temp;
		return head;
	}
}
