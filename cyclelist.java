public class cyclelist {
    public static boolean hasCycle(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null) {
            if(slow == null) return false;
            slow = slow.next;
            if(fast.next == null) return false;
            fast = fast.next.next;
        if(slow == fast) return true;
        }
        return false;
        }
        public static void display(ListNode head) {
            ListNode temp = head;
            int count = 0;
            while(temp != null && count < 20) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
                count++;
            }
            System.out.println("null");
        }
        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            head.next.next.next.next.next = head.next.next;

            if(hasCycle(head)) {
                System.out.println("cycle detected in the linked list. ");
            } else {
                System.out.println("No cycle in the linked list. ");
            }
            display(head);
        }
}

