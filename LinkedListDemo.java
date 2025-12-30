class LinkedListDemo {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Create nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Link nodes
        first.next = second;
        second.next = third;

        // Print linked list
        Node head = first;
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
