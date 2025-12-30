
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class ReverseListll {
    // Function to reverse linked list
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev; // new head
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseListll k = new ReverseListll();
        ListNode newHead = k.reverseList(head);

        // Print reversed list
        while (newHead != null) {
            System.out.print(newHead.val + " -> ");
            newHead = newHead.next;
        }
        System.out.println("NULL");
    }
}
