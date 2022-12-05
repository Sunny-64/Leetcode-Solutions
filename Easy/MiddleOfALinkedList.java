public class ListNode {
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

class MiddleOfALinkedList {
    public ListNode middleNode(ListNode head) {
        int l = length(head);
        if (l % 2 == 0) {
            l += 1;
        }
        l /= 2;
        int i = 0;
        while (i < l) {
            head = head.next;
            i++;
        }
        return head;
    }

    int length(ListNode head) {
        ListNode ptr = head;
        int l = 0;
        while (ptr != null) {
            l++;
            ptr = ptr.next;
        }
        return l;
    }
}