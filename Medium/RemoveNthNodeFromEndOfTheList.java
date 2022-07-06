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

public class RemoveNthNodeFromEndOfTheList {

    ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr = head;
        int size = 0;
        while (ptr != null) {
            size++;
            ptr = ptr.next;
        }
        if (size == 1 && n == 1) {
            return head.next;
        }
        if (n == size) {
            return head.next;
        }
        return removeNthNode(head, size, n);
    }

    ListNode removeNthNode(ListNode head, int size, int n) {
        ListNode node1 = head;
        int pos = size - n;
        for (int i = 0; i < pos - 1; i++) {
            node1 = node1.next;
        }
        node1.next = node1.next.next;
        return head;
    }
}