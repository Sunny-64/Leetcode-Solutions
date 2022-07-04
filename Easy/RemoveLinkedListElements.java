class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null || (head.next == null && head.val != val)) {
            return head;
        }
        if (head.next == null && head.val == val) {
            return head = head.next;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;

        while (ptr2 != null) {
            if (ptr2.val == val) {
                ptr1.next = ptr2.next;
            } else {
                ptr1 = ptr1.next;
            }
            ptr2 = ptr2.next;
        }
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }

}
