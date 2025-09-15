public class intersectionlist {
    public static Node findintersection (Node head1 , Node head2 ) {
        Node temp1 = head1;
        Node temp2 = head2;
        int len1 = 0;
        int len2 = 0;
        while(temp1 != null) {
            len1++;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            len2++;
            temp2 = temp2.next;
        }
        temp1 = head1;
        temp2 = head2;
        if (len1 > len2) {
            int steps = len1 - len2;
            for (int i =1; i <= steps; i++) {
                temp1 = temp1.next;
            }
        } else {
            int steps = len2 - len1;
            for(int i = 1; i <= steps; i++) {
                temp2 = temp2.next;
            }
        }
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
    public static Node nthNode2(Node head , int n ) {
        Node slow = head;
        Node fast = head;
        for(int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
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
    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node a1 = new Node(200);
        Node a2 = new Node(45);
        Node a3 = new Node(43);
        Node a4 = new Node(40);
        Node a5 = new Node(22);
        Node a6 = new Node(30);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4; 
        a4.next = a5;
        a5.next = a6;

        Node b1 = new Node(23);
        Node b2 = new Node(44);

        b1.next = b2;

        b2.next = a5;

        System.out.println("linked list A : ");
        display(a1);

        System.out.println("linked list B :");
        display(b1);

        Node intersection = findintersection(a1, b1);
        display(intersection);

        if(intersection != null) {
            System.out.println("intersection node is : " + intersection.val);
        } else {
            System.out.println("no intersection found .");
        }
    }
}
