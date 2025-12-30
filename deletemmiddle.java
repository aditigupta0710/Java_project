public class deletemmiddle {
    public static Node delmidelt(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
        
    public static class Node {
        int val;
        Node next;
        Node (int val) {
            this.val = val;
        }
    } 
    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(200);
        Node b = new Node(45);
        Node c = new Node(43);
        Node d = new Node(40);
        Node e = new Node(22);
        Node f = new Node(30);

        a.next = b;
        b.next = c;
        c.next = d; 
        d.next = e;
        e.next = f;

        display(a);
        display(delmidelt(a));
        
    }
}