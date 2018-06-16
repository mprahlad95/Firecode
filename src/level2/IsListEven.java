package level2;

public class IsListEven {
	public Boolean isListEven(ListNode head) {
	    ListNode current = head;
	    int count = 1;
	    if(head == null) return true;
	    while(current.next != null){
	        count++;
	        current = current.next;
	    }
	    if(count %2 == 0) return true;
	    else return false;
	}
}
