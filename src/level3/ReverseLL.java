package level3;

public class ReverseLL {
	public ListNode reverseList(ListNode head) {
	    if(head == null) return null;
	    ListNode prev = null, current = head, temp;
	    while(current != null){
	        temp = current.next;
	        current.next = prev;
	        prev = current;
	        current = temp;
	    }
	    return prev;
	}
}
