package level4;

public class MergeLL_recursion_extranode {
	public ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {
		ListNode l3 = null;
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.data <= l2.data) {
			l3 = l1;
			l3.next = mergeTwoSortedList(l1.next, l2);
		} else if (l2.data < l1.data) {
			l3 = l2;
			l3.next = mergeTwoSortedList(l1, l2.next);
		}
		return l3;
	}
}
