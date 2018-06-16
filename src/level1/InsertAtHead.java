package level1;

public class InsertAtHead {
	public ListNode insertAtHead(ListNode head, int data) {
        ListNode temp = new ListNode(data);
        temp.next = head;
        return temp;
}
}
