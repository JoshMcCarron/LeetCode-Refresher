class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
        this.next = null;
    }
}




public class SLL {
    Node head;
    Node tail;

    public SLL(){
        this.head = new Node(-1);
        this.tail = head;
    }

    public void insertEnd(int val){
        tail.next = new Node(val);
        tail = tail.next;

    }

    public void remove(int index){
        int i = 0;
        Node curr = head;
        while(i< index && curr.next!= null){
            i++;
            curr = curr.next;
        }
        curr.next = curr.next.next;

    }
}