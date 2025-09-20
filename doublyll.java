class doublyll {
    // Node structure
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;

    // Insert at end
    public void insert(int data) {
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
        newNode.prev = temp;
    }

    // Delete a node by value
    public void delete(int data) {
        if (head == null) return;

        Node temp = head;

        // If head node is to be deleted
        if (temp.data == data) {
            head = temp.next;
            if (head != null) head.prev = null;
            return;
        }

        // Search for the node
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        // If node not found
        if (temp == null) return;

        // If last node is to be deleted
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        // Remove links
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    // Display list forward
    public void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display list backward
    public void displayBackward() {
        if (head == null) return;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // 
    public static void main(String[] args) {
        doublyll dll = new doublyll();

        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);

        dll.displayForward();   // Forward: 10 20 30 40
        dll.displayBackward();  // Backward: 40 30 20 10

        dll.delete(20);
        dll.displayForward();   // Forward: 10 30 40
        dll.displayBackward();  // Backward: 40 30 10
    }
}
