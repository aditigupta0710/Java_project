public class countll {
    public static int Length (Node head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next; // address of next node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
      public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(54);
        Node d = new Node(6);
        Node e = new Node(7);
        Node f = new Node(75);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(Length(a));
}
        }   
