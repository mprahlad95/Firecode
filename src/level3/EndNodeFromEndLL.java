package level3;

public class EndNodeFromEndLL {
	public ListNode findNthNodeFromEnd(ListNode head, int n) {
	    if(head == null) return null;
	    ListNode current = head;
	    int length = 0;
	    while(current != null) {
	        current = current.next;
	        length++;
	    }
	    if(n>length || n<=0) return null;
	    current = head;
	    int count = 0;
	    while(current.next != null && count++ < length-n) {
	        current = current.next;
	    }
	    return current;
	}
}
