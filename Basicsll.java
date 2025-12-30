public class Basicsll {
     public static class Node{
        int data;
        Node next; // address of next node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
     public static void displayr(Node head) {
        if(head == null) return;
        displayr(head.next);
        System.out.print(head.data + " ");
       }
       public static void display(Node head) {
        while(head != null) {
            System.out.println(head.data + " ");
            head = head.next;
         }  
   }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(54);
        Node d = new Node(6);
        Node e = new Node(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(a.next);
        System.out.println(b.next);
        display(a);
        displayr(a);
    }
}