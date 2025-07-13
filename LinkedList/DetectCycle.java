package LinkedList;

public class DetectCycle {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            head.next = newNode;
            head = newNode;
        }
    }

    public static boolean detect() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // move slow by 1
            fast = fast.next.next;    // move fast by 2

            if (slow == fast) {       // cycle detected
                return true;
            }
        }

        return false; // no cycle
    }

    public static void main(String[] args) {
        DetectCycle list = new DetectCycle();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Create a cycle manually
        //tail.next = head.next;  // link tail to 2nd node to make a cycle

        System.out.println("Cycle detected: " + detect());
    }
}
