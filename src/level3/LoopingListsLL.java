package level3;

import java.util.HashSet;

public class LoopingListsLL {
	public Boolean isCyclic(ListNode head) {
	    if (head == null) return false;
	    ListNode current = head;
	    HashSet hs = new HashSet<>();
	    while(current.next != null) {
	        if(hs.contains(current)) return true;
	        else hs.add(current);
	        current = current.next;
	    }
	    return false;
	}
}
