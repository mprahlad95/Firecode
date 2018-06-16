package level1;

public class DeleteAtHead {
	public ListNode deleteAtHead(ListNode head) {
	    if(head == null) return null;
	        ListNode tempNode = head.next;
	        head = null;
	        return tempNode;
	}
}
