package LinkedList;

/*
P141: Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again
by continuously following the next pointer. Internally, pos is used to denote the index
of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class HasCycle {

    public boolean hasCycle(ListNode head) {
        ListNode L1 = head;
        int count = 0;
        while(L1!=null){
            count++;
            ListNode L2 = head;
            for(int i=0;i<count;i++){
                if(L1.next==L2){
                    return true;
                }
                L2=L2.next;
            }
            L1 = L1.next;
        }
        return false;
    }
}
