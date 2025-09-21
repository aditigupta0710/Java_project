class Node {
    int val;
    Node next;
    Node random;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class copyrandomll {

    public static Node copyRandomList(Node head) {
        if (head == null) return null;

        Node curr = head;
        while (curr != null) {
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate the two lists
        Node pseudoHead = new Node(0);
        Node copyCurr = pseudoHead;
        curr = head;
        while (curr != null) {
            copyCurr.next = curr.next;
            curr.next = curr.next.next;

            copyCurr = copyCurr.next;
            curr = curr.next;
        }

        return pseudoHead.next;
    }

    // Helper function to print list for testing
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            int randomVal = (curr.random != null) ? curr.random.val : -1;
            System.out.println("Node val: " + curr.val + ", Random points to: " + randomVal);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.next = node3;

        node1.random = node3; // 1 -> 3
        node2.random = node1; // 2 -> 1
        node3.random = node2; // 3 -> 2

        System.out.println("Original list:");
        printList(node1);

        Node copiedList = copyRandomList(node1);

        System.out.println("\nCopied list:");
        printList(copiedList);
    }
}
