public class implementation {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class linkedlist {
        Node head = null;
        Node tail = null;
        void InsertAtEnd (int data){
            Node temp = new Node(data);
            if(head == null) {
                head = temp;
            } else {
            tail.next = temp;
            }
            tail = temp;
        }
        void display() {
            Node temp  = head;
            while(temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.InsertAtEnd(4);
        ll.InsertAtEnd(3);
        ll.InsertAtEnd(6);
        ll.display();
    }
}
