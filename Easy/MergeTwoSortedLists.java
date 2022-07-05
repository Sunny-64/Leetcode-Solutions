import java.util.Scanner;

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

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode head = new ListNode(-1, null);
        ListNode head2 = new ListNode(-1, null);
        head = input(head, 3);
        System.out.println("Second Linked List");
        head2 = input(head2, 3);
        head = mergeTwoLists1(head, head2);
        display(head);

    }

    // iterative Approach.
    static ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode ptr = head;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                ptr.next = new ListNode(list2.val, null);
                list2 = list2.next;
            } else {
                ptr.next = new ListNode(list1.val, null);
                list1 = list1.next;
            }
            ptr = ptr.next;
        }
        if (list1 == null) {
            ptr.next = list2;
        } else {
            ptr.next = list1;
        }
        return head.next;
    }

    // using bubble Sort.
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergePtr = list1;
        while (mergePtr.next != null) {
            System.out.println(mergePtr.val);
            mergePtr = mergePtr.next;
        }
        mergePtr.next = list2;
        return list1;
    }

    static ListNode bubbleSortOnLinkedList(ListNode head, int n) {
        ListNode ptr = head;
        while (ptr != null) {
            ListNode movingPtr = head;
            ListNode movingNextPtr = head.next;
            for (int i = 0; i < n - 1; i++) {
                if (movingNextPtr.val < movingPtr.val) {
                    int temp = movingPtr.val;
                    movingPtr.val = movingNextPtr.val;
                    movingNextPtr.val = temp;
                }
                movingPtr = movingPtr.next;
                movingNextPtr = movingNextPtr.next;
            }
            ptr = ptr.next;
        }
        return head;
    }

    static int size(ListNode head) {
        ListNode ptr = head;
        int count = 0;
        while (ptr != null) {
            ptr = ptr.next;
            count++;
        }
        return count;
    }

    // for debugging.

    static ListNode input(ListNode head, int n) {
        ListNode ptr = head;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value : ");
            int value = sc.nextInt();
            ptr.next = new ListNode(value, null);
            ptr = ptr.next;
        }
        return head.next;
    }

    static void display(ListNode head) {
        ListNode ptr1 = head;
        while (ptr1 != null) {
            System.out.print(ptr1.val + " -> ");
            ptr1 = ptr1.next;
        }
    }
}
