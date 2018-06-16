package level2;

public class DeleteFromPosition {
	public ListNode deleteAtMiddle(ListNode head, int position) {
        int count = 1;
        ListNode current = head;
        ListNode prev = null;
        if(head == null) return null;
        if (position == 1) {
            head = current.next;
            return head;
        }
        while (current != null) {
            if(count++ == position) {
               prev.next = current.next;
            }
            prev = current;
            current = current.next;
            prev.next = current;
            
        }
    return head;
}
}
