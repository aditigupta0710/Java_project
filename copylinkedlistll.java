class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Method to print linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to copy linked list
    public LinkedList copyList() {
        if (head == null) return null;

        LinkedList newList = new LinkedList();
        Node temp = head;
        while (temp != null) {
            newList.add(temp.data); // create new nodes with same data
            temp = temp.next;
        }
        return newList;
    }
}

public class copylinkedlistll {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.print("Original list: ");
        list.printList();

        LinkedList copiedList = list.copyList();
        System.out.print("Copied list: ");
        copiedList.printList();
    }
}
