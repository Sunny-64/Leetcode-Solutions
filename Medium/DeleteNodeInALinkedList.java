import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class DeleteNodeInALinkedList {
    public static void main(String[] args) {
        // intiution behind this question is to delete the next node instead of the current node cause it's impossible to 
        // access the previous node so we copy the next node's data to the current node and delete the next node instead.
    }
    public static void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;     
    }
    public static void display(ListNode head){
        ListNode ptr = head; 
        while(ptr.next != null){
            System.out.print(ptr.val + " -> "); 
            ptr = ptr.next; 
        }
        System.out.print(ptr.val);
    }
}
