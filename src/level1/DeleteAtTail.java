package level1;

public class DeleteAtTail {
	public ListNode deleteAtTail(ListNode head) {
        ListNode current = head;
        if(head == null || head.next == null) return null;
        while(current.next.next != null) {
            current = current.next;
        }
            current.next = null;
            return head;
}
}
