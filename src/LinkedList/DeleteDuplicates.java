package LinkedList;

/*
P83: Given a sorted linked list,
delete all duplicates such that each element appear only once.
 */
public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode element = head;
        if(head==null){
            return head;
        }else{
            while(element.next!=null){

                if(element.val == element.next.val){
                    if(element.next.next==null){
                        element.next=null;
                        return head;
                    }
                    element.next=element.next.next;

                }else{
                    element = element.next;
                }

            }
            return head;
        }
    }
}
