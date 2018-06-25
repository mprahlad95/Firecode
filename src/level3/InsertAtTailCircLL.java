package level3;

public class InsertAtTailCircLL {
	public ListNode insertAtTail(ListNode head, int data) {
	    ListNode newNode = new ListNode(data);
	    if(head == null) {
	        head = newNode;
	        head.next = head;
	        return head;
	    }
	    if(head.next == head) {
	        head.next = newNode;
	        newNode.next = head;
	        return head;
	    }
	    ListNode current = head;
	    while(current.next != head) {
	        current = current.next;
	    }
	    current.next = newNode;
	    newNode.next = head;
	    return head;
	}
}
