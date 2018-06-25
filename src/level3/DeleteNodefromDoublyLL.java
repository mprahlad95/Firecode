package level3;

public class DeleteNodefromDoublyLL {
	public DoublyLinkedNode deleteAtPos(DoublyLinkedNode head, int pos) {
	    if(head == null) return null;
	    if(head.next == null && pos == 1){
	        return null;
	    }
	    if(pos == 1) {
	        DoublyLinkedNode temp = head;
	        head = null;
	        return temp.next;
	    }
	    DoublyLinkedNode current = head;
	    int count = 1;
	    while(current.next != null && ++count<pos){
	        current = current.next;
	    }
	    if(pos > count) return head;
	    if(current.next.next != null) current.next = current.next.next;     
	    else if(current.next.next == null) current.next = null;
	    return head;
	}
}
