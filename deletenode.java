
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public class deletenode {
    public void delnode(ListNode node) {
        if (node == null || node.next == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public void printlist(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
        deletenode list = new deletenode();

        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.println("before deletion : ");
        list.printlist(head);

            list.delnode(head.next);

            System.out.println("After Deletion : ");
            list.printlist(head);
    }
}