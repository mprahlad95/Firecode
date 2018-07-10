package level4;

public class AddNumbersLL {
	public static ListNode sumTwoLinkedLists(ListNode input1, ListNode input2) {
		/*
		 * if(input1 == null && input2 == null) return null; if(input1 != null && input2
		 * == null) return input1; if(input1 == null && input2 != null) return input2;
		 */
		int carry = 0;
		ListNode sum, node = new ListNode(0);
		sum = node;
		while (input1 != null || input2 != null || carry != 0) {
			if (input1 != null) {
				carry += input1.data;
				input1 = input1.next;
			}
			if (input2 != null) {
				carry += input2.data;
				input2 = input2.next;
			}
			sum.next = new ListNode(carry % 10);
			carry /= 10;
			sum = sum.next;
		}
		return node.next;
	}
}
