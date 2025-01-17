

public class MyLinkedList {
    class Node{
        Node next;
        int val;
        public Node(int val){
            this.val = val;
        }
    }
    int length;
    Node head;
    public MyLinkedList() {
        head = new Node(-1);
        length = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= length){
            return -1;
        }
        Node curr = head.next;

        for (int i = 0; i< index;i++){
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);

        newNode.next = head.next;
        head.next = newNode;
        length++;
    }
    
    public void addAtTail(int val) {
        Node curr = head;
        while(curr.next!= null){
            curr = curr.next;
        }
        Node newNode = new Node(val);
        curr.next = newNode;
        length++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index< 0 || index > length){
            return;
        }
        Node newNode = new Node(val);
        Node curr = head;
        for (int i = 0;i < index; i++){
            curr= curr.next;
        }
        newNode.next =curr.next;
        curr.next = newNode;
        length++;
        

    }
    
    public void deleteAtIndex(int index) {
         if (index < 0 || index >= length) {
            return;
        }
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        length--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */



//My solution not using a size variable
//  class MyLinkedList {
//     class ListNode{
//         int val;
//         ListNode next;
//         ListNode prev;
//         public ListNode(int val){
//             this.val = val;

             
//         }
//     }
//     ListNode head;
//     ListNode tail;
    
//     public MyLinkedList() {
//         head = new ListNode(-1);
//         tail = new ListNode(-1);
//         head.next = tail;
//         tail.prev = head;
//     }
    
//     public int get(int index) {
        
//         int i = 0;
//         ListNode curr = head;

//         while (i <= index && curr!= null){
//             i++;
//             curr = curr.next;

//         }
//         if (curr!= null){
//             return curr.val;
//         }
//         else{
//             return -1;
//         }

//     }
    
//     public void addAtHead(int val) {
//         ListNode newHead = new ListNode(val);
//         newHead.next = head.next;
//         newHead.prev = head;

//         head.next.prev = newHead;
//         head.next = newHead;
//     }
    
//     public void addAtTail(int val) {
//         ListNode newTail = new ListNode(val);
//         newTail.next = tail;
//         newTail.prev = tail.prev;

//         tail.prev.next = newTail;
//         tail.prev = newTail;
//     }
    
//     public void addAtIndex(int index, int val) {
//         ListNode curr = head;
//         int i = 0;
//         while(i <= index && curr!= null){
//             i++;
//             curr = curr.next;
//         }
//         if (curr != null){
//             ListNode newNode = new ListNode(val);
//             newNode.next = curr;
//             newNode.prev = curr.prev;
//             curr.prev.next = newNode;
//             curr.prev = newNode;
//         }
        
//     }
    
//     public void deleteAtIndex(int index) {
//         ListNode curr = head;
//         int i = 0;
//         while(i <= index && curr!= null){
//             i++;
//             curr = curr.next;
//         }
//         if (curr != null && curr.next!= null){
//             curr.prev.next = curr.next;
//             curr.next.prev = curr.prev;
//         }
//     }
// }

// /**
//  * Your MyLinkedList object will be instantiated and called as such:
//  * MyLinkedList obj = new MyLinkedList();
//  * int param_1 = obj.get(index);
//  * obj.addAtHead(val);
//  * obj.addAtTail(val);
//  * obj.addAtIndex(index,val);
//  * obj.deleteAtIndex(index);
//  */