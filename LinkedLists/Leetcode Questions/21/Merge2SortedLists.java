

public class Merge2SortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode curr = head;

        while(list1!= null && list2!= null){
            if (list1.val <= list2.val){
                curr.next = list1;
                list1= list1.next;
            }
            else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        //edge cases
        if (list1!= null){
            curr.next=list1;
        }
        else{
            curr.next=list2;
        }

        //return next and not head because of dummy value
        return head.next;
    }
}
