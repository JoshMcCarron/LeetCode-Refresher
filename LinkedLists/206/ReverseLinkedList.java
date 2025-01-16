
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

//recursively
// public class ReverseLinkedList {
//     public ListNode reverseList(ListNode head) {
//         if (head == null){
//           return head;
//         }
//         if (head.next == null){
//           return head;
//         }
//         ListNode newHead = reverseList(head.next);
  
//         head.next.next = head;
//         head.next = null;
  
//         return newHead;
          
//       }
// }

 //iteratively
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr!= null){
        ListNode tempNext = curr.next;
        curr.next = prev;
        prev = curr;
        curr = tempNext;
        }
        return prev;
    }
    
}
