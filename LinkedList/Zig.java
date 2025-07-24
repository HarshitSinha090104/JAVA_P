package LinkedList;

public class Zig {
    public class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node ZigZag(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // Find middle
        Node mid = middle(head);

        // Reverse 2nd half
        Node second = reverse(mid.next);

        // Split the list into two halves!
        mid.next = null;

        // Merge alternately
        return merge(head, second);
    }

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node middle(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;

            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }

        while (head1 != null) {
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }
        while (head2 != null) {
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Zig ll = new Zig();
        ll.add(3);
        ll.add(1);
        ll.add(45);
        ll.add(32);
        ll.add(36);
        ll.add(44);

        System.out.println("Original List:");
        ll.print(ll.head);

        ll.head = ll.ZigZag(ll.head);

        System.out.println("Zig-Zag List:");
        ll.print(ll.head);
    }
}
