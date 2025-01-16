class Node{
    int val;
    Node next;
    Node prev;
    public Node(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

public class DLL {
    Node head;
    Node tail;

    public DLL(){
        head = new Node(-1);
        tail = head;
        head.next = tail;
        tail.prev = head;
    }

    public void insertFront(int val){
        Node newNode = new Node(val);
        newNode.next = head.next;
        newNode.prev = head;

        head.next.prev = newNode;
        head.next = newNode;
    }

    public void insertEnd(int val){
        Node newNode = new Node(val);
        newNode.next = tail;
        newNode.prev = tail.prev;

        tail.prev.next = newNode;
        tail.prev = newNode;
    }

    public void removeFront(){
        head.next.next.prev = head;
        head.next = head.next.next;
    }

    public void removeEnd(){
        tail.prev.prev.next = tail;
        tail.prev = tail.prev.prev;
    }
}
