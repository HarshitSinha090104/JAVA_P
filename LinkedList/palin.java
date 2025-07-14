package LinkedList;

public class palindrome {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
      static Node head;
       static Node tail;
   
    public void add(int data){
        //create a new node
        Node newNode=new Node(data);
        //  add the node
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        //reassign head
        head=newNode;

    }
   public boolean Palindrome(Node head){
    Node mid=findMid();
    Node secondH=reverseM(mid);
   
    if(checkP(head, secondH)==1){
        return true;
    }
    return false;
   }
   public Node findMid(){
      Node slow=head;
      Node fast=head;
      while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
      return slow;
   }
   public Node reverseM(Node mid){
    Node prev=null;
    Node curr=tail=mid;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    return prev;
   }
   public int checkP(Node head,Node mid){
   
    Node temp=head;
    Node temp2=mid;
    while(temp2!=null){
        if(temp.data!=temp2.data){
           return 0;
        }
        temp=temp.next;
        temp2=temp2.next;
        
    }
    
    return 1;
   }
   public static void main(String[] args) {
    palin Link=new palin();
    Link.add(1);
    Link.add(2);
     Link.add(1);
    
   

    System.out.println(Link.Palindrome(head));
    
}
}
