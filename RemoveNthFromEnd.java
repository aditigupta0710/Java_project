class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy, second = dummy;

        // Move first pointer n+1 steps
        for (int i = 0; i <= n; i++) first = first.next;

        // Move both until first reaches end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove node
        second.next = second.next.next;

        return dummy.next;
    }

    // Test
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = removeNthFromEnd(head, 2);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
