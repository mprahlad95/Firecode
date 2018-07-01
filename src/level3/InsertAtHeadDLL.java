package level3;

public class InsertAtHeadDLL {
	public DoublyLinkedNode insertAtHead(DoublyLinkedNode head, int data) {
		DoublyLinkedNode node = new DoublyLinkedNode(data);
		if (head == null) {
			head = node;
			return head;
		}
		DoublyLinkedNode temp = head;
		head = node;
		node.next = temp;
		node.prev = null;
		return head;
	}
}
