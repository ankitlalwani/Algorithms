package LinkedList;

/*
P203-- Remove Linked List Elements.
Remove all elements from a linked list of integers that have value val.
 */

public class RemoveElements {

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;

        while(head!=null){
            if(head.val == val){
                head = head.next;
            }else{
                break;
            }
        }

        ListNode p = head;

        if(p == null) return null;

        while(p.next != null){
            if(p.next.val == val){
                ListNode q = p.next;
                p.next = q.next;
            }else{
                p = p.next;
            }
        }
        return head;
    }
}
