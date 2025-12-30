public class Implementation2 {
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
        
        void InsertAtEnd (int data) {
            Node temp = new Node(data);
            if(head == null) {
                head = temp;
            } else{
                tail.next = temp;
            } 
            tail = temp;
        }

        void InsertAtBeginning (int data){
            Node temp = new Node(data);
            if(head == null) {
                head = tail =  temp;
            } else {
            temp.next = head;
            head = temp;
            }
        }
        void display() {
            Node temp  = head;
            while(temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.InsertAtEnd(8);
        ll.display();
        ll.InsertAtEnd(7);
        ll.display();
        ll.InsertAtBeginning(28);
        ll.display();
    }
}
