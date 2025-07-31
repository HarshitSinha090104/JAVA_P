package LinkedList;

public class Recu {
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
        public int searchR(Node head,int key){
            if(head==null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            int index=searchR(head.next,key);
            if(index==-1){
                return -1;
            }
            return index+1;
        }
        public int recur(int key){
            return searchR(head, key);
        }
        public static void main(String[] args) {
            Recu Link=new Recu();
            Link.add(8);
            Link.add(7);
            Link.add(6);
            Link.add(5);
            Link.add(4);
            Link.add(3);
            Link.add(2);
            Link.add(1);
            Link.add(0);
          System.out.println(Link.recur(6));
        }
    }
    

