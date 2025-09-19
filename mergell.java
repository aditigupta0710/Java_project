public class mergell {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1 == null || head2 == null) {
            return head1 == null ? head2 : head1;
        } 
        if(head1.val <= head2.val) {
            head1.next = mergeTwoLists(head1.next,head2);
            return head1;
        } else {
            head2.next = mergeTwoLists(head1 , head2.next);
            return head2;
        }
    }
    public static void main(String[] args) {
        // First LinkedList: 1 -> 3 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        // Second LinkedList: 2 -> 4 -> 6
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        ListNode merged = mergeTwoLists(l1,l2);

        // Print merged linked list
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
}

