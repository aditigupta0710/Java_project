class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}
public class SplitOddEven {
    Node head;

        void insert (int data) {
            Node newNode = new Node(data);
            if(head == null ) {
                head = newNode;
                return;
            }
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        void printList(Node node) {
            while(node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
            System.out.println();
        }
        void splitoddeven() {
         Node oddHead = null , oddTail = null;
         Node evenHead = null , evenTail = null;
        Node current = head;
            while(current != null) {
                if(current.data % 2 == 0) {
                    if(evenHead == null) {
                        evenHead = evenTail = new Node(current.data);
                    } else {
                        evenTail.next = new Node(current.data);
                        evenTail = evenTail.next;
                    }
                } else {
                    if(oddHead == null) {
                        oddHead = oddTail = new Node(current.data);
                    } else {
                        oddTail.next = new Node(current.data);
                        oddTail = oddTail.next;
                    }
                }
                current = current.next;
            }
            System.out.println("Odd List : ");
            printList(oddHead);
            System.out.println("Even List :");
            printList(evenHead);
        }
        public static void main(String[] args) {
        SplitOddEven list = new SplitOddEven();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        System.out.print("Original List: ");
        list.printList(list.head);

        list.splitoddeven();
    }
}
