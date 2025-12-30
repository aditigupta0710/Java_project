public class delfromstart {
    public static Node nthNode(Node head , int n) {
        int size = 0;
        Node temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size-n+1;
        //mth node from start
        temp = head;
        for(int i = 1; i <= m-1; i++) 
        {
            temp = temp.next;
        }
        return temp;
    }
    public static class Node {
        int val;
        Node next;
        Node (int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(200);
        Node b = new Node(45);
        Node c = new Node(43);
        Node d = new Node(40);
        Node e = new Node(22);
        Node f = new Node(30);

        a.next = b;
        b.next =c;
        c.next = d; 
        d.next = e;
        e.next = f;
        Node q = nthNode(a, 3);
        System.out.println(q.val);

    }
}
