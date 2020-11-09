package LinkedList;
/*
P160. Intersection of Two Linked Lists.
Write a program to find the node at which the intersection of two singly linked lists begins.
*/

public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode L1 = headA;
        ListNode L2 = headB;
        ListNode L3 = null;
        if(L1==null){
            return L3;
        }
        else if(L2==null){
            return L3;
        }
        else{
            while(L1!=null){
                L2 = headB;
                while(L2!=null){
                    if(L1==L2){
                        L3 = L1;
                        return L3;
                    }
                    L2=L2.next;
                }
                L1=L1.next;
            }
            return L3;
        }
    }
}
