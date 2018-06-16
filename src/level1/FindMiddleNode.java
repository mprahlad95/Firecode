package level1;

public class FindMiddleNode {
	public ListNode findMiddleNode(ListNode head) {
	    ListNode slow=head;
	    ListNode fast=head;
	    if(head == null) return null;
	    while(fast.next != null && fast.next.next != null) {
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	    return slow;
	}
}
