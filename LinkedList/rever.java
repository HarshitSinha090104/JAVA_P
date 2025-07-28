package LinkedList;

public class rever {
    public class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }  
        }
        public static Node head;
      public  static Node tail;
        public void add(int data){
            Node newNode= new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public void reverse(){
            Node prev=null;
            Node curr=tail=head;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
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
        public static void main(String[] args) {
            rever Link=new rever();
            Link.add(8);
            Link.add(7);
            Link.add(6);
            Link.add(5);
            Link.add(4);
            Link.add(3);
            Link.add(2);
            Link.add(1);
            Link.add(0);
            System.out.println("Before");
            Link.print(head);
            System.out.println("After");
            Link.reverse();
            Link.print(head);
        }

}
