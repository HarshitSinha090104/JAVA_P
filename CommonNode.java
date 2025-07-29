package LinkedList;

public class CommonNode {
    
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
            tail.next = newNode;
            tail = newNode;
        }
    }
     public void print(Node head){
        Node temp=head;
        if(temp==null){
         return;
        }
        while(temp!=null){
               System.out.print(temp.data+"->");
               temp=temp.next;
        }
        System.out.println("null");
    }

    public Node CommonPoint(Node head1,Node head2){
       while(head2!=null){
        Node temp=head1;
        
            while(temp!=null){
                if(temp==head2){
                    return temp;
                }
                temp=temp.next;
            }
            head2=head2.next;
       }
       return null;
    }
    public static void main(String args[]){
        CommonNode Link=new CommonNode();

        Node head1=new Node(1);
        Node head2=new Node(2);

         Node newNode= new Node(3);
         head1.next=newNode;

         newNode=new Node(4);
         head2.next=newNode;

         newNode=new Node(5);
         head1.next.next=newNode;
         head2.next.next=newNode;

         newNode=new Node(7);
         head1.next.next.next=null;

         newNode=new Node(8);
         head2.next.next.next=newNode;
         
         System.out.println("1st Linked List");
         Link.print(head1);
         System.out.println("2nd Linked List");
         Link.print(head2);
         System.out.println("Common Element");
         Node temp=Link.CommonPoint(head1,head2);
         System.out.println(temp.data);
         
         
         
         

    }
}
